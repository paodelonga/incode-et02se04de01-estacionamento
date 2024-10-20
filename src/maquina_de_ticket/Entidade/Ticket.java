package maquina_de_ticket.Entidade;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
    private Identificador identificador;
    private EstadoPagamento estadoPagamento;
    private Integer preco;
    private Vaga vagaAlugada;
    private LocalDateTime dataAquisicao;

    public Ticket(Identificador identificador_ticket) {
        identificador = identificador_ticket;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public EstadoPagamento getEstadoPagamento() {
        return estadoPagamento;
    }

    public Integer getPreco() {
        return preco;
    }

    public Vaga getVagaAlugada() {
        return vagaAlugada;
    }

    public LocalDateTime getDataAquisicao() {
        return dataAquisicao;
    }

    public void setIdentificador(Identificador identificador_ticket) {
        identificador = identificador_ticket;
    }

    public void setEstadoPagamento(EstadoPagamento estado_pagamento) {
        estadoPagamento = estado_pagamento;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public void setVagaAlugada(Vaga vaga_alugada) {
        vagaAlugada = vaga_alugada;
    }

    public void setDataAquisicao(LocalDateTime data_aquisicao) {
        dataAquisicao = data_aquisicao;
    }
}
