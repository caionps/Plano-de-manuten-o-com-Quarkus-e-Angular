package org.caio.resource;

import org.caio.model.Mecanico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/mecanico")
public class MecanicoResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Mecanico> list() {
        return Mecanico.listAll();
    }
}
