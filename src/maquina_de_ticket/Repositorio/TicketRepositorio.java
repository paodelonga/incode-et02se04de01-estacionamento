package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.Ticket;

import java.util.HashSet;

public class TicketRepositorio {
    private HashSet<Ticket> ticketsAdquiridos;

    public TicketRepositorio() {
        this.ticketsAdquiridos = new HashSet<Ticket>();
    }
}
