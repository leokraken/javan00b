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
	public Usuario login(String usuario){
		return em.find(Usuario.class, usuario);
		
	}

}
