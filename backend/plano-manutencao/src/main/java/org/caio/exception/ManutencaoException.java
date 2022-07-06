package org.caio.exception;

import org.caio.model.Manutencao;

import javax.inject.Inject;

public class ManutencaoException extends RuntimeException{
    public final Long id;

    public ManutencaoException(Long id) {
        this.id = id;
    }

    @Inject
    Manutencao manutencao;

    public ManutencaoException(Long id, Manutencao manutencao) {
        this.id = id;
        this.manutencao = manutencao;
    }

    public Object getMessage(String s) {
        return s = "O id " + id + " não está cadastrado";
    }
}
