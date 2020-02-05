package com.wisezone.food.usermanager.dao;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wisezone.food.usermanager.entity.Department;
import com.wisezone.food.usermanager.entity.Employee;

public class IEmployeeDaoTest {
	public static final Logger log = Logger.getLogger(IPersonDao.class);
	IEmployeeDao employeeDao;

	@Before
	public void before() {
		// 初始化spring核心容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		// 从spring容器获取指定bean实例
		employeeDao = (IEmployeeDao) ctx.getBean("employeeDao");
	}
	
	@Test
	public void testFindEmployeeByName() {
		Employee employee = employeeDao.findEmployeeByName("小明");
		log.info(employee);
	}

}
