package test;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Usuario;

@Stateless
public class practicoService implements practicoEJB {

	@PersistenceContext(unitName = "testEJB")
    private EntityManager em;
	
	public Usuario findUsuario(String UsuarioID){
		Usuario u = em.find(Usuario.class, UsuarioID);
		return u;
	} 
	
	@Override
	public Usuario login(String usuario){
		return em.find(Usuario.class, usuario);
		
	}

}
