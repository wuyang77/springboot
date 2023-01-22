package com.atguigu;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
//@RunWith(SpringRunner.class) //当导入的junit的jar包是4的时候不需要该注解
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }
}
