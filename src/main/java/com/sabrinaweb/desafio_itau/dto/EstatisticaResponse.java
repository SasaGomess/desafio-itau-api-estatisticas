package com.sabrinaweb.desafio_itau.dto;

import com.sabrinaweb.desafio_itau.model.Estatistica;

public record EstatisticaResponse(Long count,
                                  Double sum,
                                  Double avg,
                                  Double min,
                                  Double max) {
    public EstatisticaResponse(Estatistica estatistica){
        this(estatistica.getCount(), estatistica.getSum(), estatistica.getAvg(), estatistica.getMin(), estatistica.getMax());
    }
    public EstatisticaResponse(){
        this(0L, 0.0, 0.0, 0.0, 0.0);
    }
}
