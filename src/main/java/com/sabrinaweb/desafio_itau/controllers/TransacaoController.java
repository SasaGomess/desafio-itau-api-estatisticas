package com.sabrinaweb.desafio_itau.controllers;

import com.sabrinaweb.desafio_itau.dto.TransacaoRequest;
import com.sabrinaweb.desafio_itau.services.TransacaoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    private TransacaoService service;

    public TransacaoController(TransacaoService transacaoService){
        this.service = transacaoService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody TransacaoRequest request){
        service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(){
        service.delete();
        return ResponseEntity.ok().build();
    }

}
