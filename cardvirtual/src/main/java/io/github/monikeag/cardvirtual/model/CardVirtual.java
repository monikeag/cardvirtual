package io.github.monikeag.cardvirtual.model;


import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
public class CardVirtual {

    @Id //Aqui informo que o ID é a chave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    @CreationTimestamp
    private LocalDateTime dataCriacao;
    private String email;
    private String numeroCartao;

    // Construtor vazio (obrigatório para o JPA)
    public CardVirtual() {}

    // Construtor com parâmetros
    public CardVirtual(String email, String numeroCartao) {
        this.email = email;
        this.numeroCartao = numeroCartao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

}