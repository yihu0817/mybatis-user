package com.wisezone.food.usermanager.dao;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wisezone.food.usermanager.entity.Order;

public class IOrderDaoTest {
	public static final Logger log = Logger.getLogger(IPersonDao.class);
	IOrderDao orderDao;

	@Before
	public void before() {
		// 初始化spring核心容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		// 从spring容器获取指定bean实例
		orderDao = (IOrderDao) ctx.getBean("orderDao");
	}
	@Test
	public void testFindOrderAndPersonById() {
		Order order = orderDao.findOrderAndPersonById("O_00001");
		log.info(order);
	}
	@Test
	public void testFindOrderById() {
		Order order = orderDao.findOrderById("O_00001");
		log.info(order);
	}

}
