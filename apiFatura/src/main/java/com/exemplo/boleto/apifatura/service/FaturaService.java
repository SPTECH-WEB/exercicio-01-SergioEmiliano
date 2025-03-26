package com.exemplo.boleto.apifatura.service;

import com.exemplo.boleto.apifatura.model.Fatura;
import com.exemplo.boleto.apifatura.repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {

    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }


    public Fatura salvar(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    public List<Fatura> listarTodos() {
        return faturaRepository.findAll();
    }
}
