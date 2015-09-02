package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import test.practicoEJB;
import entities.Usuario;

@WebService
public class loginWS {

	practicoEJB bll;
	
	public loginWS() {
		
	}
	
	@WebMethod	
	public boolean login(String user, String password){
		Usuario u = bll.login(user);
		if(u!=null && u.getPassword().equals(password))
			return true;
		return false;
	}
	
}
