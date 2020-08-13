package cn.doublefloat.jdmall.project.shopcar.mapper;

import cn.doublefloat.jdmall.project.shopcar.domain.po.ShopCarPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 9:31 上午
 */
@Repository
public interface ShopCarMapper {

    /**
     * 添加商品信息
     *
     * @param shopCarPO 商品信息
     * @return 结果
     */
    public Integer addShopCarItem(ShopCarPO shopCarPO);

    /**
     * 删除商品信息
     *
     * @param userId    用户编号
     * @param productId 商品编号
     * @return 结果
     */
    public Integer deleteShopCarItem(@Param("userId") Long userId, @Param("productId") String productId);

    /**
     * 批量删除购物车信息
     *
     * @param userId     用户编号
     * @param productIds 商品编号
     * @return
     */
    public Integer deleteShopCarItems(@Param("userId") Long userId, @Param("productIds") String[] productIds);

    /**
     * 删除用户全部购物车信息
     *
     * @param userId 用户ID
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

    /**
     * 检查购物车商品数量
     *
     * @param userId    用户编号
     * @param productId 商品编号
     * @return 结果
     */
    public ShopCarPO checkShopCarItemUnique(@Param("userId") Long userId, @Param("productId") String productId);
}
