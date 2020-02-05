package com.wisezone.food.usermanager.dao;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wisezone.food.usermanager.entity.Student;

public class IStudentDaoTest {
	public static final Logger log = Logger.getLogger(IPersonDao.class);
	IStudentDao studentDao;

	@Before
	public void before() {
		// 初始化spring核心容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		// 从spring容器获取指定bean实例
		studentDao = (IStudentDao) ctx.getBean("studentDao");
	}
	
	@Test
	public void testFindStudentByName() {
		Student student = studentDao.findStudentByName("米兰");
		log.info(student);
	}

}
