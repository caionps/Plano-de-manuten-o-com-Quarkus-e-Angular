package org.caio.resource;

import org.caio.exception.ManutencaoException;
import org.caio.model.Manutencao;
import org.caio.repository.ManutencaoRepository;
import org.caio.service.ManutencaoService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
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
    @Inject
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
    @Transactional
    public Response criarManutencao(Manutencao manutencao) {
        manutencaoRepository.persist(manutencao);
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response alterarManutencao(@PathParam("id") Long id, Manutencao manutencao) {
        Manutencao manutencaoEntity = manutencaoRepository.findById(id);

        manutencaoEntity.setPrimeiraManutencao(manutencao.getPrimeiraManutencao());
        manutencaoEntity.setAtividade(manutencao.getAtividade());
        manutencaoEntity.setFrequencia(manutencao.getFrequencia());
        manutencaoEntity.setMaquina(manutencao.getMaquina());
        manutencaoEntity.setIdMecanico(manutencao.getIdMecanico());

        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deletarManutencao(@PathParam("id") Long id) {
        boolean deleted = manutencaoRepository.deleteById(id);
        return Response.ok().build();
    }

}
