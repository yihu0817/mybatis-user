package com.wisezone.food.usermanager.dao;

import org.springframework.stereotype.Repository;

import com.wisezone.food.usermanager.entity.Person;

@Repository("personDao")
public interface IPersonDao {
	public Person findPersonById(String id);// 根据id查询Person

	public Person findPersonAndOrdersById(String id); // 根据id查询Person同时将person关联的所有订单都查出
}
