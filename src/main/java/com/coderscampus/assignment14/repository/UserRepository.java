package com.coderscampus.assignment14.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.coderscampus.assignment14.domain.User;

@Repository 
public class UserRepository {
	List<User> users = new ArrayList<>();

	public User save(User user) {
		user.setUserId((long) (users.size() + 1));
	    users.add(user);
	    return user;
	}

}
