package cn.enjoy.test;


import cn.enjoy.App;
import cn.enjoy.dao.UsersMapper;
import cn.enjoy.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Resource
    private UsersMapper usersMapper;

    @Test
    public void testAdd(){

        Users users = new Users();
        users.setPassword("123457");
        users.setUsername("Lzhcapple1");
        usersMapper.insertSelective(users);

    }


}
