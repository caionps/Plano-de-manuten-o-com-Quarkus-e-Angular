package org.caio.dto;

import org.caio.model.Manutencao;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;


public class ManutencaoDTO {
    private Long id;
    private Integer idMecanico;
    private LocalDate primeiraManutencao;
    private Integer frequencia;
    private String atividade;
    private String maquina;

    public ManutencaoDTO (Manutencao manutencao) {
        this.id = manutencao.getId();
        this.idMecanico = manutencao.getIdMecanico();
        this.primeiraManutencao = manutencao.getPrimeiraManutencao();
        this.frequencia = manutencao.getFrequencia();
        this.atividade = manutencao.getAtividade();
        this.maquina=manutencao.getMaquina();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(Integer idMecanico) {
        this.idMecanico = idMecanico;
    }

    public LocalDate getPrimeiraManutencao() {
        return primeiraManutencao;
    }

    public void setPrimeiraManutencao(LocalDate primeiraManutencao) {
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
