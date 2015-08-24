package model;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import test.practicoService;

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {

	private String username;
    private String password;
     
	@EJB
	practicoService bll;
    
    public String getUserName() {
        return username;
    }
 
    public void setUserName(String userName) {
        this.username = userName;
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
