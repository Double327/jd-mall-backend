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

    /**
     * 商品名
     */
    private String productName;

    /**
     * 商品价格
     */
    private Double productPrice;

    /**
     * 商品图片
     */
    private String productImage;

    /**
     * 商品数量
     */
    private Integer quantity;

    public ShopCarPO() {
    }

    public ShopCarPO(Long id, Long userId, String productId, String productName, Double productPrice, String productImage, Integer quantity) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShopCarPO{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productImage='" + productImage + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
