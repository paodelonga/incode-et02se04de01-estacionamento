package maquina_de_ticket.Entidade;

import java.util.UUID;

public class Ticket {
    private Identificador identificador;
    private EstadoPagamento estadoPagamento;
    private Integer valor;
    private Vaga vagaReferente;

    public Ticket() {
        this.estadoPagamento = EstadoPagamento.PENDENTE;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }

    public EstadoPagamento getEstadoPagamento() {
        return estadoPagamento;
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
