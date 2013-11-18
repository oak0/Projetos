package br.com.login.service;

import br.com.login.beans.User;

public interface LoginService {
    User login(String username, String password) throws IllegalArgumentException;
}