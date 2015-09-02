package test;

import javax.ejb.Local;

import entities.Usuario;

@Local
public interface practicoEJB {

	public Usuario login(String usuario);

}
