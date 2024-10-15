package maquina_de_ticket.Entidade;

public enum EstadoPagamentoEntidade {
    PENDENTE(0), PAGO(1), CANCELADO(2);

    private Integer estadoPagamento;

    EstadoPagamentoEntidade(Integer estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }
}
