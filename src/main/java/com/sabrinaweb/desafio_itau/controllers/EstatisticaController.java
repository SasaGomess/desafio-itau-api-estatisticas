package com.sabrinaweb.desafio_itau.controllers;

import com.sabrinaweb.desafio_itau.dto.EstatisticaResponse;
import com.sabrinaweb.desafio_itau.services.EstatisticaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {
    private EstatisticaService service;

    public EstatisticaController(EstatisticaService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<EstatisticaResponse> getStatistics(){
        EstatisticaResponse response = service.estatisticasTransacoes();
        return ResponseEntity.ok(response);
    }
}
