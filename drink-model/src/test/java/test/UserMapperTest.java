package test;

import com.fcguy.drink.mapper.UserMapper;
import com.fcguy.drink.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testFindAll(){
		List<User> users = userMapper.findAll();
        System.out.println(users);
	}
}
