package com.wisezone.food.usermanager.dao;

import org.springframework.stereotype.Repository;

import com.wisezone.food.usermanager.entity.Courses;
import com.wisezone.food.usermanager.entity.Student;

@Repository("studentDao")
public interface IStudentDao {
	/**
	 * 根据姓名查找学生，并且将学生选学的所有课程查出
	 * 思路: 1.根据姓名查找学生
	 *      2.根据姓名查找学生选学的课程
	 */
	public Student findStudentByName(String name);
	
	/**
	 * 根据课程名查找课程，并将选学该课程所有学生查出
	 * 思路: 1.根据课程名查找课程
	 *      2.根据课程名查找选学该课程所有学生
	 */
	public Courses findCourseByName(String courseName);
}
