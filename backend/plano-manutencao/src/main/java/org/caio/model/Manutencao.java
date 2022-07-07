package org.caio.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "manutencao")
@Entity
public class Manutencao {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Integer idMecanico;

    @Column
    private LocalDate primeiraManutencao;

    @Column
    private Integer frequencia;

    @Column
    private String atividade;

    @Column
    private String maquina;

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
