package com.wisezone.food.usermanager.dao;

import org.springframework.stereotype.Repository;

import com.wisezone.food.usermanager.entity.Department;
import com.wisezone.food.usermanager.entity.Employee;

@Repository("employeeDao")
public interface IEmployeeDao {
	//根据姓名查找员工，并将员工所在部门查出
	public Employee findEmployeeByName(String name);
	
}
