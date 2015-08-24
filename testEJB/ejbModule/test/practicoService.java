package test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Usuario;

@Stateless
@LocalBean
public class practicoService {

	@PersistenceContext(unitName = "testEJB")
    private EntityManager em;
	
	public String Hello(){
		return "Hello servlet...";
	}
	public Usuario findUsuario(String UsuarioID){
		Usuario u = em.find(Usuario.class, UsuarioID);
		return u;
	} 
	public boolean login(String usuario, String pass){
		Usuario u = em.find(Usuario.class, usuario);
		if(u!=null && u.getPassword().equals(pass))
			return true;		
		return false;
	}

}
