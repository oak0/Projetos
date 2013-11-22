package br.com.login.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import br.com.login.beans.User;
import br.com.login.dao.generic.GenericDAOJPAImpl;

@Repository
public class UserDAOImpl extends GenericDAOJPAImpl<User, Long> implements UserDAO, Serializable {
 

	@Override
	public User getById(Long id) {
		
		return (User) super.read(id);
	}
    
    

	
}
