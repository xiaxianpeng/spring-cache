package com.example.springCache;

import com.example.springCache.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCacheApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	void contextLoads() {
	}

}