package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.model.User;



public interface UserService {
	public boolean adduser(User user);
	public List<User> getUser();
	public boolean updateuser(Long id,User user);
	public boolean deleteUser(Long id);
	public Page<User>getAllUser(PageRequest pageRequest);

	public List<String> getFullName();
	List<User>findAllUser();
	public User getEmail(String email);
	List<User> findAllQuery();
	public int updateUserQuery(String name, Long id);
	public int deleteUserQuery(Long id);

}
