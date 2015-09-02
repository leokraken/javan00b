package ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import test.practicoEJB;
import entities.Usuario;

@Stateless
@Path("loginREST")
public class loginREST extends Application {

	@EJB
	practicoEJB bll;
	
	@GET
	@Produces("application/json")
	@Path("{user}/{password}")
	public Response login(@PathParam("user")String user, @PathParam("password")String password) throws Exception{
		Usuario u=bll.login(user);
		if(u!=null && u.getPassword().equals(password)){
			return Response.status(200).entity(u).build();
			//return u;
		}
		return Response.status(200).entity("Not valid login...").build();
	}
}
