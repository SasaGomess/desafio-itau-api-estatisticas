package com.sabrinaweb.desafio_itau.controllers;

import com.sabrinaweb.desafio_itau.dto.TransacaoRequest;
import com.sabrinaweb.desafio_itau.services.EstatisticaService;
import com.sabrinaweb.desafio_itau.services.TransacaoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    private TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService){
        this.transacaoService = transacaoService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody TransacaoRequest request){
        transacaoService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(){
        transacaoService.delete();
        return ResponseEntity.ok().build();
    }

}
