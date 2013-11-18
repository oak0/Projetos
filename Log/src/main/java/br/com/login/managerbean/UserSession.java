package br.com.login.managerbean;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.login.beans.User;


@Component
@Scope("session")
public class UserSession implements Serializable{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;

   public User getUser() {
       return user;
   }

   public void setUser(User user) {
       this.user = user;
   }
    
   public boolean isLoggedIn(){
       return user != null;
   }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((user == null) ? 0 : user.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserSession other = (UserSession) obj;
	if (user == null) {
		if (other.user != null)
			return false;
	} else if (!user.equals(other.user))
		return false;
	return true;
}
   
}
