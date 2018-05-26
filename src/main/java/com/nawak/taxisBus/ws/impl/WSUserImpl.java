package com.nawak.taxisBus.ws.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.nawak.taxisBus.bean.user.User;
import com.nawak.taxisBus.services.UserService;
import com.nawak.taxisBus.ws.WSUser;

@Component
public class WSUserImpl extends WSCRUDImpl<User> implements WSUser {

	
	public WSUserImpl(@Autowired UserService userService) {
		super(userService);
	}

	@Override
	public List<User> list() {
    	return super.list();
	}
	
	@Override
	public void delete(@PathVariable("id") Long id) {
		super.delete(id);
		return ;
	}
	
}
