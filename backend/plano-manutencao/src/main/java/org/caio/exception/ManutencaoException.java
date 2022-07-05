package org.caio.exception;

import org.caio.model.Manutencao;

public class ManutencaoException extends RuntimeException{
    public final Long id;

    public ManutencaoException(Long id) {
        this.id = id;
    }
}
