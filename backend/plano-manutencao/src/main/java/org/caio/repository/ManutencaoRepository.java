package org.caio.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.caio.model.Manutencao;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

@ApplicationScoped
public class ManutencaoRepository implements PanacheRepository<Manutencao> {
    public Response updateManutencao(LocalDate primeiraManutencao, String atividade,
                                     Integer frequencia, String maquina,
                                     Integer idMecanico, Long id){
        this.update("PrimeiraManutencao = ?1 " +
                "Atividade = ?2 " +
                "Frequencia = ?3 " +
                "Maquina = ?4 " +
                "IdMecanico = ?5 WHERE id=?6" , 1, 2, 3, 4, 5, 6);

        return Response.ok().build();
    }
}