package org.kenta.kosugi.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldService implements Serializable {

    @GET
    @Path("/{world}")
    public String world(@PathParam("world") String world){
        return "Hello " + world;
    }

}
