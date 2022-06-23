package org.caio.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Manutencao extends PanacheEntity {
    private Integer idMecanico;
    private LocalDateTime primeiraManutencao;
    private Integer frequencia;
    private String atividade;
    private String maquina;
}
