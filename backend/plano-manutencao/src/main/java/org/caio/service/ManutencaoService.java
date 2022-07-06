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
    ManutencaoDTO manutencaoDTO;

    public Optional<Manutencao> findId (Long id) {

        Optional<Manutencao> manutencao = manutencaoRepository.findById(id);
        manutencao.orElseThrow(() -> new ManutencaoException(id));

        return manutencao;
    }
}
