package org.caio.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Mecanico extends PanacheEntity {
    private String nome;
    private String cpf;
}
