package cn.doublefloat.jdmall.project.shopcar.service;

import cn.doublefloat.jdmall.project.shopcar.domain.ShopCar;
import cn.doublefloat.jdmall.project.shopcar.domain.po.ShopCarPO;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 10:01 上午
 */
public interface ShopCarService {

    /**
     * 添加商品信息
     *
     * @param shopCarPo 商品信息
     * @return 结果
     */
    public Integer addShopCarItem(ShopCarPO shopCarPo);

    /**
     * 删除商品信息
     *
     * @param userId    用户编号
     * @param productId 商品编号
     * @return 结果
     */
    public Integer deleteShopCarItem(Long userId, String productId);

    /**
     * 批量删除购物车信息
     *
     * @param userId     用户编号
     * @param productIds 商品编号
     * @return 结果
     */
    public Integer deleteShopCarItems(Long userId, String[] productIds);

    /**
     * 删除用户全部购物车信息
     *
     * @param userId 用户编号
     * @return 结果
     */
    public Integer deleteAll(Long userId);

    /**
     * 更新商品信息
     *
     * @param shopCarPo 商品信息
     * @return 结果
     */
    public Integer updateShopCarItem(ShopCarPO shopCarPo);

    /**
     * 查询用户购物车信息
     *
     * @param userId 用户编号
     * @return 结果
     */
    public List<ShopCarPO> queryShopCarByUserId(Long userId);
}
