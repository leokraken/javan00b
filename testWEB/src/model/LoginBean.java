package model;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import test.practicoService;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
     
	@EJB
	practicoService bll;
    

 
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

      
    public String validar()
    {
    	boolean ok = bll.login(username, password);
    	if(ok)
    		return "home";
    	else
    		return "failure";
    }
	
}
