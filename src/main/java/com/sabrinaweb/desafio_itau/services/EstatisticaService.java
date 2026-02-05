package com.sabrinaweb.desafio_itau.services;

import com.sabrinaweb.desafio_itau.dto.EstatisticaResponse;
import com.sabrinaweb.desafio_itau.model.Transacao;
import org.springframework.stereotype.Service;
import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;


@Service
public class EstatisticaService {
    private TransacaoService service;

    public EstatisticaService(TransacaoService service){
        this.service = service;
    }

    public EstatisticaResponse estatisticasTransacoes(){
        DoubleSummaryStatistics summaryStatistics = service.getTransacoes().stream().filter(t -> OffsetDateTime.now().minusSeconds(60).isBefore(t.getDataHora()))
                .mapToDouble(Transacao::getValor)
                .summaryStatistics();

        return new EstatisticaResponse(summaryStatistics);
    }
}
