package com.sabrinaweb.desafio_itau.services;

import com.sabrinaweb.desafio_itau.dto.EstatisticaResponse;
import com.sabrinaweb.desafio_itau.model.Estatistica;
import com.sabrinaweb.desafio_itau.model.Transacao;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

@Service
public class EstatisticaService {
    private TransacaoService service;

    public EstatisticaService(TransacaoService service){
        this.service = service;
    }

    public EstatisticaResponse estatisticasTransacoes(){

        if (service.getTransacoes().isEmpty()){
            return new EstatisticaResponse();
        }

        DoubleSummaryStatistics summaryStatistics = service.getTransacoes().stream().filter(t -> OffsetDateTime.now().minusSeconds(60).isBefore(t.getDataHora()))
                .map(Transacao::getValor)
                .collect(Collectors.summarizingDouble(Double::doubleValue));

        Estatistica estatistica = new Estatistica(summaryStatistics);

        return new EstatisticaResponse(estatistica);
    }
}
