package com.wisezone.food.usermanager.dao;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wisezone.food.usermanager.entity.Order;
import com.wisezone.food.usermanager.entity.Person;

public class IPersonDaoTest {
	public static final Logger log = Logger.getLogger(IPersonDao.class);
	IPersonDao personDao;

	@Before
	public void before() {
		// 初始化spring核心容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		// 从spring容器获取指定bean实例
		personDao = (IPersonDao) ctx.getBean("personDao");
	}

	@Test
	public void testFindPersonById() {
		Person person = personDao.findPersonById("001");
		log.info("person :"+person);
		for(Order order : person.getOrders()) {
			log.info("price :"+order.getPrice() + " number :"+order.getNumber());
		}
	}
	
	@Test
	public void testFindPersonAndOrdersByID() {
		Person person = personDao.findPersonAndOrdersById("001");
		log.info("person :"+person);
		for(Order order : person.getOrders()) {
			log.info("price :"+order.getPrice() + " number :"+order.getNumber());
		}
	}

}
