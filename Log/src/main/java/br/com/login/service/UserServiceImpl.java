package br.com.login.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.login.beans.User;
import br.com.login.dao.UserDAO;

@Service
@Transactional
public class UserServiceImpl implements UserService, Serializable {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void create(User u) {
		userDAO.create(u);
	}

	@Override
	public void update(User u) {
		userDAO.update(u);
		
	}
	
	public void delete(User u){
		userDAO.delete(u);
	}
	
	public User read(Long id){
		return userDAO.read(id);
	}

}
