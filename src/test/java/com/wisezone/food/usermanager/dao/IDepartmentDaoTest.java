package com.wisezone.food.usermanager.dao;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wisezone.food.usermanager.entity.Department;
import com.wisezone.food.usermanager.entity.Employee;

public class IDepartmentDaoTest {
	public static final Logger log = Logger.getLogger(IPersonDao.class);
	IDepartmentDao departmentDao;

	@Before
	public void before() {
		// 初始化spring核心容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		// 从spring容器获取指定bean实例
		departmentDao = (IDepartmentDao) ctx.getBean("departmentDao");
	}
	@Test
	public void testFindDepartmentByName() {
		Department department = departmentDao.findDepartmentByName("技术部");
		log.info(department);
		for(Employee employee : department.getEmployeeLists()) {
			log.info(employee.getName());
		}
	}

}
