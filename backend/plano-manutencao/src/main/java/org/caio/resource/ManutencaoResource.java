package org.caio.resource;

import org.caio.model.Manutencao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/manutencao")
public class ManutencaoResource {

    @Inject
    Manutencao manutencao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manutencao> listaTodos() {
        return Manutencao.listAll();
    }

    @GET
    @Path("/{id}")
    public List<Manutencao> listaEspecifico(@PathParam String id) {
        return List<this.manutencao> listaEspecifico(id);
    }
}
