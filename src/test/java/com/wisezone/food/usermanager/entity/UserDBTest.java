package com.wisezone.food.usermanager.entity;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wisezone.food.usermanager.utils.DateUtil;

public class UserDBTest {
	SqlSession sqlSession;
	@Before
	public void before() {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		sqlSession = sqlSessionFactory.openSession();
	}
	
	@After
	public void after() {
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testAddUser() throws IOException {
		User user = new User("小花1","123","/",DateUtil.nowTime());
		sqlSession.insert("UserMapper.insertUser", user);
	}
	
	@Test
	public void testUpdateUser() {
		User user = new User(11,"大花","123456","/update/1.jpg",DateUtil.nowTime());
		sqlSession.update("UserMapper.updateUser",user);
	}
	
	@Test
	public void testDeleteUserByID() {
		sqlSession.delete("UserMapper.deleteUser", 1);
	}
	
	@Test
	public void testDeleteUserByNameAndPassword() {
		String name= "小丽";
		String psw = "123";
		Map<String,String> parameters = new HashMap<>();
		parameters.put("username", name);
		parameters.put("password", psw);
		
		sqlSession.delete("UserMapper.deleteUserByNameAndPsw", parameters);
	}
	
	@Test
	public void testFindUserByID() {
		User user = sqlSession.selectOne("UserMapper.findUserByID", 2);
		System.out.println("user :"+user);
	}
	@Test
	public void testFindUserByNameAndPsw() {
		Map<String,String> parameters = new HashMap<>();
		parameters.put("username", "root");
		parameters.put("password", "123");
		User user = sqlSession.selectOne("UserMapper.findUserByNameAndPsw", parameters);
		System.out.println("user :"+user);
	}
	
	@Test
	public void testFindUserList() {
		List<User> userLists = sqlSession.selectList("UserMapper.findUserLists");
		for(User user:userLists) {
			System.out.println(user);
		}
	}
	
}
