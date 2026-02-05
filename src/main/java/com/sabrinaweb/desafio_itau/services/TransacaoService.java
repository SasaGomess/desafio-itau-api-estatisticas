package com.sabrinaweb.desafio_itau.services;

import com.sabrinaweb.desafio_itau.dto.TransacaoRequest;
import com.sabrinaweb.desafio_itau.model.Transacao;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {
    private List<Transacao> transacoes = new ArrayList<>();

    public TransacaoService(){
    }

    public void create(TransacaoRequest transacaoRequest){
        if (transacaoRequest.dataHora().isAfter(OffsetDateTime.now()) || transacaoRequest.valor() < 0){
            throw new IllegalArgumentException("A data e hora não podem estar no futuro, e o valor não deve ser negativo");
        }

        transacoes.add(new Transacao(transacaoRequest.valor(), transacaoRequest.dataHora()));
    }

    public void delete(){
        transacoes.clear();
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
