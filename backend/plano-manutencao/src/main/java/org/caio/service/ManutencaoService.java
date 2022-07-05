package org.caio.service;

import org.caio.exception.ManutencaoException;
import org.caio.model.Manutencao;
import org.caio.repository.ManutencaoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ManutencaoService {
    @Inject
    ManutencaoRepository manutencaoRepository;

    public Manutencao findId (Long id) {
        if (id == null)
        return manutencaoRepository.findById(id);
        throw new ManutencaoException(id);
    }
}
