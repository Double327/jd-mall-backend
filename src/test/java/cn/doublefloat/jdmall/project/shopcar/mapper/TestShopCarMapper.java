package cn.doublefloat.jdmall.project.shopcar.mapper;

import cn.doublefloat.jdmall.project.shopcar.domain.po.ShopCarPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 李广帅
 * @date 2020/8/13 9:52 上午
 */
@SpringBootTest
public class TestShopCarMapper {

    @Autowired
    private ShopCarMapper shopCarMapper;


    @Test
    public void testAddShopCarItem() {
        ShopCarPO shopCarPO = new ShopCarPO();
        shopCarPO.setUserId(1L);
        shopCarPO.setProductId("00F2662D84884C91A5336463BC57915F");
        shopCarPO.setQuantity(10);
        Integer result = shopCarMapper.addShopCarItem(shopCarPO);
        if (result > 0) {
            System.out.println("添加成功!");
        }
    }

    @Test
    public void testDeleteShopCarItem() {
        shopCarMapper.deleteShopCarItem(1L, "09099d7e183349669e3596462bd8846d");
    }

    @Test
    public void testDeleteShopCarItems() {
        String[] ids = {"00F2662D84884C91A5336463BC57915F", "09099d7e183349669e3596462bd8846d"};
        shopCarMapper.deleteShopCarItems(1L, ids);
    }

    @Test
    public void testQueryShopCarByUserId() {
        List<ShopCarPO> list = shopCarMapper.queryShopCarByUserId(1L);
        list.forEach(System.out::println);
    }
}
