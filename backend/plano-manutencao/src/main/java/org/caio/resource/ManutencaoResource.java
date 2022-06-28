package org.caio.resource;

import org.caio.model.Manutencao;
import org.caio.repository.ManutencaoRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

import static org.jboss.resteasy.reactive.RestResponse.Status.BAD_REQUEST;
import static org.jboss.resteasy.reactive.RestResponse.Status.NOT_FOUND;

@Path("/manutencao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ManutencaoResource {

    @Inject
    ManutencaoRepository manutencaoRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
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
    @Path("/cadastro-manutencao")
    @Transactional

    public Response criarManutencao(Manutencao manutencao) {
        manutencaoRepository.persist(manutencao);
        if(manutencaoRepository.isPersistent(manutencao)) {
            return Response.created(URI.create("/manutencao"+manutencao.getId())).build();
        }
        return Response.status(BAD_REQUEST).build();
    }



}
