package org.caio.resource;

import org.caio.model.Manutencao;
import org.caio.repository.ManutencaoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;

@Path("/manutencao")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ManutencaoResource {

    @Inject
    ManutencaoRepository manutencaoRepository;

    @GET
    public Response listaTodos() {
        List<Manutencao> manutencaoList = manutencaoRepository.listAll();
        return Response.ok(manutencaoList).build();
    }

    @GET
    @Path("/{id}")
    public Response listaIdEspecifico(@PathParam("id") Long id) {
        return manutencaoRepository.findByIdOptional(id)
                .map(manutencao -> Response.ok(manutencao).build())
                .orElse(Response.status(NOT_FOUND).build());
    }

    @POST
    @Path("/teste")
    @Transactional
    public Response criarManutencao(Manutencao manutencao) {
        manutencaoRepository.persist(manutencao);
        return Response.ok().build();
    }
}
