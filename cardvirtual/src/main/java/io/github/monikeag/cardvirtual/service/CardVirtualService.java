package io.github.monikeag.cardvirtual.service;


import io.github.monikeag.cardvirtual.model.CardVirtual; //Gera um novo objeto
import io.github.monikeag.cardvirtual.repository.CardVirtualRepository;// Save > FindAll
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CardVirtualService {

    @Autowired
    private CardVirtualRepository repository;

    // Gera um número de cartão aleatório e salva POST
    public CardVirtual criarCartao(String email) {
        String numeroGerado = gerarNumeroCartao();
        CardVirtual cartao = new CardVirtual(email, numeroGerado);
        return repository.save(cartao);
    }

    // Retorna todos os cartões cadastrados GET
    public List<CardVirtual> listarTodos() {
        return repository.findAll();
    }

    // Gerar os numeros do cartão
    private String gerarNumeroCartao() {
        Random random = new Random();
        StringBuilder numero = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            numero.append(random.nextInt(10));
            if ((i + 1) % 4 == 0 && i != 15) { //separar os numeros
                numero.append("-");
            }
        }

        return numero.toString();
    }

}


