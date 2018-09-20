import com.afeng.pojo.User;
import com.afeng.service.UserService;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author afeng
 * @date 2018/9/20 14:48
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestConnection
{
    @Resource(name = "userServiceImpl")
    private UserService userService;

    @Resource(name = "dataSource")
    private DruidDataSource dataSource;

    @Test
    public void testDataSource()
    {
        System.out.println(dataSource);
    }

    @Test
    public void testQueryAllUser()
    {
        List<User> list = userService.queryAllUser();
        System.out.println(list);
    }

    @Test
    public void testQueryUser()
    {
        System.out.println(userService.queryUser(1));
    }

    @Test
    public void testInsertUser()
    {
        User user = new User();
        user.setUsername("亚索");
        user.setPassword("123456");
        userService.insertUser(user);
    }

    @Test
    public void testDeleteUser()
    {
        userService.deleteUser(3);
    }

    @Test
    public void testUpdateUser()
    {
        User user = new User();
        user.setUid(4);
        user.setUsername("易大师");
        user.setPassword("master");
        userService.updateUser(user);
    }


}
