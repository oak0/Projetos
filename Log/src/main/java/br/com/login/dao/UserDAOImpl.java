package br.com.login.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.login.beans.User;
import br.com.login.dao.generic.GenericDAOJPAImpl;

@Repository
public class UserDAOImpl extends GenericDAOJPAImpl<User, Long> implements UserDAO {
 
 
    @Override
    public User login(String username, String password) {
        String query = "FROM User u where u.username = ?1 and u.password=?2";
        Query q = entityManager.createQuery(query);
        q.setParameter(1, username);
        q.setParameter(2, password);
 
        @SuppressWarnings("unchecked")
		List<User> l = (List<User>)q.getResultList();
 
        if (l == null || l.isEmpty() || l.size() > 1) {
            return null;
        }
        return (User) l.get(0);
    }

	@Override
	public User getById(Long id) {
		
		return (User) super.read(id);
	}
    
    

	
}
