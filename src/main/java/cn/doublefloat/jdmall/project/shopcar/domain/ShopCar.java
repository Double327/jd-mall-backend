package cn.doublefloat.jdmall.project.shopcar.domain;

import cn.doublefloat.jdmall.framework.web.domain.BaseEntity;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 9:25 上午
 */
public class ShopCar extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商品数量
     */
    private Integer total;

    /**
     * 商品信息
     */
    private List<?> rows;

    public ShopCar() {
    }

    public ShopCar(Long userId, Integer total, List<?> rows) {
        this.userId = userId;
        this.total = total;
        this.rows = rows;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
