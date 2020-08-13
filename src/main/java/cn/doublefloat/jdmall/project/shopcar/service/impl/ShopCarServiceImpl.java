package cn.doublefloat.jdmall.project.shopcar.service.impl;

import cn.doublefloat.jdmall.common.utils.StringUtils;
import cn.doublefloat.jdmall.project.shopcar.domain.po.ShopCarPO;
import cn.doublefloat.jdmall.project.shopcar.mapper.ShopCarMapper;
import cn.doublefloat.jdmall.project.shopcar.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 10:05 上午
 */
@Service
public class ShopCarServiceImpl implements ShopCarService {

    @Autowired
    private ShopCarMapper shopCarMapper;

    @Override
    public Integer addShopCarItem(ShopCarPO shopCarPo) {
        ShopCarPO item = shopCarMapper.checkShopCarItemUnique(shopCarPo.getUserId(), shopCarPo.getProductId());
        if (StringUtils.isNotNull(item)) {
            item.setQuantity(shopCarPo.getQuantity() + item.getQuantity());
            return shopCarMapper.updateShopCarItem(item);
        }
        return shopCarMapper.addShopCarItem(shopCarPo);
    }

    @Override
    public Integer deleteShopCarItem(Long userId, String productId) {
        return shopCarMapper.deleteShopCarItem(userId, productId);
    }

    @Override
    public Integer deleteShopCarItems(Long userId, String[] productIds) {
        return shopCarMapper.deleteShopCarItems(userId, productIds);
    }

    @Override
    public Integer deleteAll(Long userId) {
        return shopCarMapper.deleteAll(userId);
    }

    @Override
    public Integer updateShopCarItem(ShopCarPO shopCarPo) {
        return shopCarMapper.updateShopCarItem(shopCarPo);
    }

    @Override
    public List<ShopCarPO> queryShopCarByUserId(Long userId) {
        return shopCarMapper.queryShopCarByUserId(userId);
    }
}
