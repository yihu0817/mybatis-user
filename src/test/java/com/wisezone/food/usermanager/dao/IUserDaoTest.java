package com.wisezone.food.usermanager.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wisezone.food.usermanager.entity.User;
import com.wisezone.food.usermanager.utils.DateUtil;

public class IUserDaoTest {
	IUserDao userDao;

	@Before
	public void before() {
		// 初始化spring核心容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		// 从spring容器获取指定bean实例
		userDao = (IUserDao) ctx.getBean("userDao");
	}

	@Test
	public void testInsertUser() {
		User user = new User("张三", "123", "/", DateUtil.nowTime());
		userDao.insertUser(user);
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setId(2);
		user.setUserName("小明");
		
		userDao.updateUser(user);
	}

	@Test
	public void testDeleteUser() {
		userDao.deleteUser(5);
	}

	@Test
	public void testDeleteUserByName() {
		userDao.deleteUserByName("root");
	}

	@Test
	public void testFindUserByID() {
		User user = userDao.findUserByID(2);
		System.out.println(user);
	}

	@Test
	public void testFindUserByNameAndPsw() {
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("username", "root");
		hashMap.put("password", "123");

		User user = userDao.findUserByNameAndPsw(hashMap);
		System.out.println(user);
	}

	@Test
	public void testFindUserByNameAndPswTwo() {
		List<User> user = userDao.findUserByNameAndPswTwo(null, null);
		System.out.println(user);
	}

	@Test
	public void testFindUserLists() {
		List<User> userList = userDao.findUserLists();
		for (User user : userList) {
			System.out.println(user);
		}
	}
}
