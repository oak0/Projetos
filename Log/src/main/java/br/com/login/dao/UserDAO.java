package br.com.login.dao;

import br.com.login.beans.User;
import br.com.login.dao.generic.GenericDAO;



public interface UserDAO extends GenericDAO<User, Long> {
 
    User getById(Long id);
     
}