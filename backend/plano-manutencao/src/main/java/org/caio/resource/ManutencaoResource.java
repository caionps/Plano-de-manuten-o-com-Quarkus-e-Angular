package org.caio.resource;

import org.caio.model.Manutencao;
import org.caio.repository.ManutencaoRepository;
import org.caio.service.ManutencaoService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/manutencao")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ManutencaoResource {

    @Inject
    ManutencaoRepository manutencaoRepository;
    ManutencaoService manutencaoService;

    @GET
    public Response listaTodos() {
        List<Manutencao> manutencaoList = manutencaoRepository.listAll();
        return Response.ok(manutencaoList).build();
    }

    @GET
    @Path("/{id}")
    public Response findId(@PathParam("id") Long id) {

        return Response.ok().entity(manutencaoService.findId(id)).build();
    }

    @POST
    @Path("/teste")
    @Transactional
    public Response criarManutencao(Manutencao manutencao) {
        manutencaoRepository.persist(manutencao);
        return Response.ok().build();
    }
}
