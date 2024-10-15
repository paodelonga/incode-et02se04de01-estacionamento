package maquina_de_ticket.Entidade;

import java.util.UUID;

public class Ticket {
    private Boolean valor;
    private EstadoPagamento estadoPagamento;
    private final UUID identificador;

    public Ticket() {
        this.estadoPagamento = EstadoPagamento.PENDENTE;
        this.identificador = UUID.randomUUID();
    }
}
