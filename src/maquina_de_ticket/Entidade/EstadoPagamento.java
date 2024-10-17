package maquina_de_ticket.Entidade;

public enum EstadoPagamento {
    PENDENTE(0), PAGO(1), CANCELADO(2);

    private Integer estadoPagamento;

    EstadoPagamento(Integer estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }
}
