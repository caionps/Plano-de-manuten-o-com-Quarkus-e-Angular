package org.caio.exception;

import org.caio.model.Manutencao;

public class ManutencaoException extends RuntimeException{
    public final String name;

    public ManutencaoException(String name) {
        this.name = name;
    }
}
