package com.sales4agro.repository;

import com.sales4agro.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
