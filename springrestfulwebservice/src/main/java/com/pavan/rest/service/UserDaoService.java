package com.pavan.rest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pavan.rest.entity.User;

@Component
public class UserDaoService {

	public UserDaoService() {
	

	}
	private static List<User> users=new ArrayList<>();
	
	private static int userCount=3;
	
	static {
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Sanju",new Date()));
		users.add(new User(3,"Anjani",new Date()));
	}
	public List<User> findAll()
	{
		return users;
	}
	
	public User save(User user)
	{
		if(user.getId()==null)
		{
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		 for (User user : users) {
		 if (user.getId() == id) {
		 return user;
		 }
		 }
		 return null;
	}
	
}
