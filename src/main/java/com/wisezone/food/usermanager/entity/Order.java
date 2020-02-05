package com.wisezone.food.usermanager.entity;

/**
 * 订单实体
 * 多对一关联
 * 类结构: 多端持有一端实例
 * 
 */
public class Order {
	private String id;
	private String number;
	private int price;
	private Person person;
	
	public Order() {
		super();
	}

	public Order(String id, String number, int price, Person person) {
		super();
		this.id = id;
		this.number = number;
		this.price = price;
		this.person = person;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", price=" + price + ", person=" + person + "]";
	}

	
}