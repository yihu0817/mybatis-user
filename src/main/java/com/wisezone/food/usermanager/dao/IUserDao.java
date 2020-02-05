package com.wisezone.food.usermanager.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

import com.wisezone.food.usermanager.entity.User;

/**
 * IUserDao 与 UserMapper.xml 约定映射 1. 命令空间与接口名对应
 * namespace="com.wisezone.food.usermanager.dao.IUserDao" 2. id值与方法名对应
 * id="insertUser" 《=》 insertUser(User user)
 *
 */
@Repository("userDao")
public interface IUserDao {
	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

	@Delete("DELETE FROM user WHERE name=#{username}")
	public void deleteUserByName(String username);

	public User findUserByID(int id);

	public User findUserByNameAndPsw(Map<String, String> map);

	public List<User> findUserByNameAndPswTwo(String username, String password);

	public List<User> findUserLists();
}
