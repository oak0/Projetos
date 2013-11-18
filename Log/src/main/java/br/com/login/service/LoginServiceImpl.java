package br.com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.login.beans.User;
import br.com.login.dao.UserDAO;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
    private UserDAO dao;
    
    @Override
    public User login(String username, String password)
            throws IllegalArgumentException {
        if (isEmptyOrNull(username) || isEmptyOrNull(password)) {
            throw new IllegalArgumentException(
                    "Atenção, username ou password vazios!");
        }
        

        User u = dao.login(username, password);
        
        if (u == null) {
            throw new IllegalArgumentException(
                    "Erro: username ou password incorretos!");
        }
        return u;
    }
 
    private boolean isEmptyOrNull(String s) {
        return s == null || s.equals("");
    }
}
