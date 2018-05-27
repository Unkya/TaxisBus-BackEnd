package com.nawak.taxisBus.ws;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nawak.taxisBus.bean.user.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/user")
@Api(value = "/user", description = "Utilisateur", consumes="application/json")
public interface WSUser {
	
	
	@ApiOperation(value = "List des utilisateurs")
	@RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> list();
	
	@ApiOperation(value = "Création d'un utilisateur")
	@RequestMapping(value = "", method = RequestMethod.PUT)
    public User add(User user);
	
	@ApiOperation(value = "Récupération d'un utilisateur")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Long id);
	
	@ApiOperation(value = "Mise à jour d'un utilisateur")
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public User update(@PathVariable("id") Long id, User user);
	
	@ApiOperation(value = "Suppression d'un utilisateur")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id);
	
	
	
}
