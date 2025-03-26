package com.exemplo.boleto.apifatura.controller;

import com.exemplo.boleto.apifatura.model.Fatura;
import com.exemplo.boleto.apifatura.repository.FaturaRepository;
import com.exemplo.boleto.apifatura.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {

    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public List<Fatura> listar() {
        return faturaService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Fatura> criarFatura(@Valid @RequestBody Fatura fatura) {
            Fatura novaFatura = faturaService.salvar(fatura);
            return ResponseEntity.ok(novaFatura);
    }
}
