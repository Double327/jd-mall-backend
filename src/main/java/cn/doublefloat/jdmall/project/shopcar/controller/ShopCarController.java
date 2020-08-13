package cn.doublefloat.jdmall.project.shopcar.controller;

import cn.doublefloat.jdmall.common.utils.ServletUtils;
import cn.doublefloat.jdmall.framework.security.service.TokenService;
import cn.doublefloat.jdmall.framework.web.controller.BaseController;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import cn.doublefloat.jdmall.framework.web.page.TableDataResult;
import cn.doublefloat.jdmall.project.shopcar.domain.po.ShopCarPO;
import cn.doublefloat.jdmall.project.shopcar.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 10:15 上午
 */
@RestController
@RequestMapping("/shopcar")
public class ShopCarController extends BaseController {

    @Autowired
    private ShopCarService shopCarService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/add")
    public AjaxResult add(ShopCarPO shopCarPO) {
        Long userId = tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId();
        shopCarPO.setUserId(userId);
        return toAjax(shopCarService.addShopCarItem(shopCarPO));
    }

    @DeleteMapping("/deleteItem/{productId}")
    public AjaxResult deleteShopCarItem(@PathVariable String productId) {
        Long userId = tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId();
        return toAjax(shopCarService.deleteShopCarItem(userId, productId));
    }

    @DeleteMapping("/deleteItems")
    public AjaxResult deleteShopCarItems(@RequestBody String[] productIds) {
        for (int i = 0; i < productIds.length; i++) {
            System.out.println(productIds[i]);
        }
        Long userId = tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId();
        return toAjax(shopCarService.deleteShopCarItems(userId, productIds));
    }

    @DeleteMapping("/deleteAll")
    public AjaxResult deleteAll() {
        Long userId = tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId();
        return toAjax(shopCarService.deleteAll(userId));
    }

    @PutMapping("/update")
    public AjaxResult updateShopCarItem(ShopCarPO shopCarPO) {
        return toAjax(shopCarService.updateShopCarItem(shopCarPO));
    }

    @PostMapping("/list")
    public TableDataResult list() {
        Long userId = tokenService.getLoginUser(ServletUtils.getRequest()).getUser().getUserId();
        List<ShopCarPO> list = shopCarService.queryShopCarByUserId(userId);
        return getTableData(list);
    }
}
