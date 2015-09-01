package model;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Usuario;
import test.practicoService;


@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
    private Usuario usuario;
    
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

    
      
    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String validar()
    {
    	usuario = bll.login(username);
    	if(usuario!=null && usuario.getPassword().equals(password))
    		return "home";
    	else
    		return "failure";
    }
	
}
