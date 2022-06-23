package org.caio.resource;

import org.caio.model.Manutencao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/manutencao")
public class ManutencaoResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manutencao> list() {
        return Manutencao.listAll();
    }
}
