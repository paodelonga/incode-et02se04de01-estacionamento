package maquina_de_ticket.Entidade;

import java.time.LocalDateTime;

public class TicketEntidade {
    private IdentificadorEntidade identificador;
    private EstadoPagamentoEntidade estadoPagamento;
    private Integer preco;
    private VagaEntidade vagaReferente;
    private LocalDateTime dataAquisicao;

    public TicketEntidade(IdentificadorEntidade identificador) {
        this.identificador = identificador;
    }

    public IdentificadorEntidade getIdentificador() {
        return identificador;
    }

    public EstadoPagamentoEntidade getEstadoPagamento() {
        return estadoPagamento;
    }

    public Integer getPreco() {
        return preco;
    }

    public VagaEntidade getVagaReferente() {
        return vagaReferente;
    }

    public LocalDateTime getDataAquisicao() {
        return dataAquisicao;
    }

    public void setIdentificador(IdentificadorEntidade identificador) {
        this.identificador = identificador;
    }

    public void setEstadoPagamento(EstadoPagamentoEntidade estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public void setVagaReferente(VagaEntidade vagaReferente) {
        this.vagaReferente = vagaReferente;
    }

    public void setDataAquisicao(LocalDateTime dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}
