package org.caio.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.ws.rs.GET;
import java.time.LocalDateTime;

@ApplicationScoped
@Entity
public class Manutencao extends PanacheEntity {

    @Column
    private Integer idMecanico;

    @Column
    private LocalDateTime primeiraManutencao;

    @Column
    private Integer frequencia;

    @Column
    private String atividade;

    @Column
    private String maquina;

    public Integer getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(Integer idMecanico) {
        this.idMecanico = idMecanico;
    }

    public LocalDateTime getPrimeiraManutencao() {
        return primeiraManutencao;
    }

    public void setPrimeiraManutencao(LocalDateTime primeiraManutencao) {
        this.primeiraManutencao = primeiraManutencao;
    }

    public Integer getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Integer frequencia) {
        this.frequencia = frequencia;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
}
