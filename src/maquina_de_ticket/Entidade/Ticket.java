package maquina_de_ticket.Entidade;

import java.time.LocalDateTime;

public class Ticket {
    private Identificador identificador;
    private EstadoPagamento estadoPagamento;
    private Integer preco;
    private Vaga vagaReferente;
    private LocalDateTime dataAquisicao;

    public Ticket(Identificador identificador) {
        this.identificador = identificador;
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

    public Vaga getVagaReferente() {
        return vagaReferente;
    }

    public LocalDateTime getDataAquisicao() {
        return dataAquisicao;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public void setVagaReferente(Vaga vagaReferente) {
        this.vagaReferente = vagaReferente;
    }

    public void setDataAquisicao(LocalDateTime dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}
