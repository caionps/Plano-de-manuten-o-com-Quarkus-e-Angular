package org.caio.dto;

import org.caio.model.Manutencao;

import java.time.LocalDate;


public class ManutencaoDTO {
    private Integer idMecanico;
    private LocalDate primeiraManutencao;
    private Integer frequencia;
    private String atividade;
    private String maquina;


    public ManutencaoDTO (Manutencao manutencao) {
        this.idMecanico = manutencao.getIdMecanico();
        this.primeiraManutencao = manutencao.getPrimeiraManutencao();
        this.frequencia = manutencao.getFrequencia();
        this.atividade = manutencao.getAtividade();
        this.maquina=manutencao.getMaquina();
    }
}
