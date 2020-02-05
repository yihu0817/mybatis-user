package com.wisezone.food.usermanager.dao;

import org.springframework.stereotype.Repository;

import com.wisezone.food.usermanager.entity.Order;

@Repository("orderDao")
public interface IOrderDao {
	public Order findOrderById(String id);
	public Order findOrderAndPersonById(String id);
}
