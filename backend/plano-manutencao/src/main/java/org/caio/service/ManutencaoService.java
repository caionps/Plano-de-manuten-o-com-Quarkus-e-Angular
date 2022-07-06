package org.caio.service;

import org.caio.dto.ManutencaoDTO;
import org.caio.exception.ManutencaoException;
import org.caio.model.Manutencao;
import org.caio.repository.ManutencaoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import java.util.Optional;

@ApplicationScoped
public class ManutencaoService {
    @Inject
    ManutencaoRepository manutencaoRepository;

    public Manutencao findId (Long id) {
        return manutencaoRepository.findByIdOptional(id).orElseThrow(() -> new ManutencaoException(id));
    }

//    public void update(long id, Manutencao manutencao) {
//        try{
//            manutencaoRepository.update(manutencao);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new ManutencaoException(id, manutencao);
//        }
//    }
}
