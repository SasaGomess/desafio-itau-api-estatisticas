package com.sabrinaweb.desafio_itau.dto;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public record TransacaoRequest (
        @NotNull
        Double valor,
        @NotNull
        OffsetDateTime dataHora){
}
