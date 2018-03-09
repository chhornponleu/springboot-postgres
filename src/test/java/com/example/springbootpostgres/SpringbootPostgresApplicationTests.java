package com.example.springbootpostgres;

import com.example.springbootpostgres.entity.UserEntity;
import com.example.springbootpostgres.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootPostgresApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		UserEntity user = new UserEntity("Ponleu", new Date(), "M");
		user = userService.save(user);
		System.out.println(user.getId() == null ? "empty id" : user.getId().toString());
	}

}
