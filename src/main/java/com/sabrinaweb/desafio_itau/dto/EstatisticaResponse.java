package com.sabrinaweb.desafio_itau.dto;

public record EstatisticaResponse(Integer count,
                                  Double sum,
                                  Double avg,
                                  Double min) {
}
