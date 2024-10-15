package maquina_de_ticket.Entidade;

public class TicketEntidade {
    private IdentificadorEntidade identificador;
    private EstadoPagamentoEntidade estadoPagamento;
    private Integer valor;
    private VagaEntidade vagaReferente;

    public TicketEntidade(IdentificadorEntidade identificador, VagaEntidade vagaReferente) {
        this.identificador = identificador;
        this.vagaReferente = vagaReferente;
        this.estadoPagamento = EstadoPagamentoEntidade.PENDENTE;
    }

    public IdentificadorEntidade getIdentificador() {
        return identificador;
    }

    public EstadoPagamentoEntidade getEstadoPagamento() {
        return estadoPagamento;
    }

    public Integer getValor() {
        return valor;
    }

    public VagaEntidade getVagaReferente() {
        return vagaReferente;
    }

    public void setIdentificador(IdentificadorEntidade identificador) {
        this.identificador = identificador;
    }


    public void setEstadoPagamento(EstadoPagamentoEntidade estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }


    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setVagaReferente(VagaEntidade vagaReferente) {
        this.vagaReferente = vagaReferente;
    }
}
