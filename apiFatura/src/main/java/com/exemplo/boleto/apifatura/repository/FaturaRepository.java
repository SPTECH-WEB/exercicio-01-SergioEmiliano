package com.exemplo.boleto.apifatura.repository;

import com.exemplo.boleto.apifatura.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}
