package com.wisezone.food.usermanager.dao;

import org.springframework.stereotype.Repository;

import com.wisezone.food.usermanager.entity.Department;

@Repository("departmentDao")
public interface IDepartmentDao {
	//根据部门名查询部门，并且将部门关联的所有员工查出
	public Department findDepartmentByName(String name);
}
