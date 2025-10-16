package io.github.monikeag.cardvirtual.controller;


import io.github.monikeag.cardvirtual.model.CardVirtual;
import io.github.monikeag.cardvirtual.service.CardVirtualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Rest
@RequestMapping("/api/cartoes") //API > Onde o usuário integare
public class CardVirtualController {

    @Autowired
    private CardVirtualService service;

    // Recebe o email e chama o SERVICE para gerar o cartão
    @PostMapping
    public CardVirtual criarCartao(@RequestParam String email) {
        return service.criarCartao(email);
    }

    // Endpoint GET para listar todos os cartões gerados
    @GetMapping
    public List<CardVirtual> listarCartoes() {
        return service.listarTodos();
    }
}
