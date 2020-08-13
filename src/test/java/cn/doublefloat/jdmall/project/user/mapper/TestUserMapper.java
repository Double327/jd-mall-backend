package cn.doublefloat.jdmall.project.user.mapper;

import cn.doublefloat.jdmall.project.user.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 李广帅
 * @date 2020/8/5 11:07 上午
 */
@SpringBootTest
public class TestUserMapper {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("Double");
        user.setNickname("达布尔");
        user.setPhonenum("13145218799");
        user.setPassword(passwordEncoder.encode("123456"));

        Integer result = userMapper.add(user);
        if (result >= 1) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }
    }

    @Test
    public void testQueryUserByUsername() {
        User aDouble = userMapper.queryUserByUsername("Double");
        System.out.println(aDouble);
    }
}
