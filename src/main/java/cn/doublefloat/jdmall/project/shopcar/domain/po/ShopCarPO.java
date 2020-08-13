package cn.doublefloat.jdmall.project.shopcar.domain.po;

/**
 * @author 李广帅
 * @date 2020/8/13 9:27 上午
 */
public class ShopCarPO {

    /**
     * 编号
     */
    private Long id;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 商品ID
     */
    private String productId;

    private String image;




    /**
     * 商品数量
     */
    private Integer quantity;

    public ShopCarPO() {
    }

    public ShopCarPO(Long id, Long userId, String productId, Integer quantity) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
