package com.wisezone.food.usermanager.entity;
import java.util.List;

/**
 * 客户实体
 * 一端拥有多端集合
 */
public class Person {
	private String id;
	private String name;
	private String address;
	private String tel;
	private List<Order> orders;

	public Person() {
		super();
	}

	public Person(String id, String name, String address, String tel, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.orders = orders;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "{id: " + id + ", name: " + name + ", address: " + address + ", tel: " + tel + "}";
	}
}