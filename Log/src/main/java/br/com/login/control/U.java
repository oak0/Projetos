package br.com.login.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import br.com.login.beans.Role;
import br.com.login.beans.User;
import br.com.login.service.UserService;

@Controller
@Scope("session")
public class U implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3422893591542821039L;

	@Autowired
	private UserService userService;
	
	private String test = "foi";

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	public void go(){
		User u = new User();
		u.setPassword("vixi");
		u.setUsername("vixi2");
		Role r = new Role();
		r.setId(new Long(2));
		//r.setDescription("ROLE_USER");
		List<Role> rs = new ArrayList<Role>();
		rs.add(r);
		u.setRoles(rs);
		userService.create(u);
	}
	
	public String red(){
		return "/pages/admin/adminPage.jsf"+ "?faces-redirect=true";
	}
	
}
