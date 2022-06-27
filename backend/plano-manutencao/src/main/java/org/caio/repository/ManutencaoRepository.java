package org.caio.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.caio.model.Manutencao;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ManutencaoRepository implements PanacheRepository<Manutencao> {
}
