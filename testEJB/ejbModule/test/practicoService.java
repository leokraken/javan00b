package test;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import entities.Usuario;

@Stateless
public class practicoService implements practicoEJB {
	//@PersistenceUnit(unitName="testEJB")
	//EntityManagerFactory emf;
	@PersistenceContext(unitName = "testEJB")
    private EntityManager em;
	public practicoService() {
		// TODO Auto-generated constructor stub
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("testEJB");	       
		//em = emf.createEntityManager();
	}
    
	public Usuario findUsuario(String UsuarioID){
		Usuario u = em.find(Usuario.class, UsuarioID);
		return u;
	} 
	
	@Override
	public Usuario login(String usuario){
		return em.find(Usuario.class, usuario);
		
	}

}
