package com.atguigu;

import com.atguigu.dao.UserDao;
import com.atguigu.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
//@SpringJUnitConfig
public class JPATest {
    @Autowired
    private UserDao userDao;
    /**
     * 测试向数据库插入数据获取更新数据
     */
    @Test
    public void testSave(){
        //创建User对象
        User user = new User();
        user.setUsername("wuyang");
        user.setPassword("6666");
        user.setName("李四");
        //测试添加
//        userDao.save(user);
        //测试更新
        user.setId(1L);
        userDao.save(user);
    }
}
