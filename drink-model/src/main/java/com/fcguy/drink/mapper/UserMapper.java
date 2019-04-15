package com.fcguy.drink.mapper;

import com.fcguy.drink.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	public void insertUser(User news);
	public void deleteUser(int id);
	public void updateUser(User news);
	public User findUserById(int id);
	public User login(@Param("account") String account, @Param("password") String password);
	public long getUserCount();
	public List<User> findAll();
	public List<User> findPage(@Param("index") int index, @Param("limit") int limit);
}
