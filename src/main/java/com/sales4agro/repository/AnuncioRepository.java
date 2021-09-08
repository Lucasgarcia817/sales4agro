package com.sales4agro.repository;

import com.sales4agro.domain.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, UUID> {
}
