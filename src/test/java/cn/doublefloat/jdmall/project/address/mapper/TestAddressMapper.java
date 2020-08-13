package cn.doublefloat.jdmall.project.address.mapper;

import cn.doublefloat.jdmall.project.address.domain.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author 李广帅
 * @date 2020/8/12 2:05 下午
 */
@SpringBootTest
public class TestAddressMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Test
    public void testAdd() {
        Address address = new Address();
        address.setUserId(1L);
        address.setProvince("江苏省");
        address.setCity("徐州市");
        address.setArea("铜山区");
        address.setStreet("fdjsakl;gjas");
        address.setPhonenum("12345678910");
        address.setRealName("lgs");
        address.setCreateTime(new Date());
        address.setDefaultAddress(false);
        Integer res = addressMapper.add(address);
        if (res >= 1) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }
    }
}
