package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.Ticket;

import java.util.LinkedList;

public class TicketRepositorio {
    private LinkedList<Ticket> ticketsAdquiridos;

    public TicketRepositorio() {
        this.ticketsAdquiridos = new LinkedList<Ticket>();
    }

    public LinkedList<Ticket> getTicketsAdquiridos() {
        return ticketsAdquiridos;
    }

    public void setTicketsAdquiridos(LinkedList<Ticket> tickets_adquiridos) {
        this.ticketsAdquiridos = tickets_adquiridos;
    }

    public Boolean addTicket(Ticket ticket) {
        return this.ticketsAdquiridos.add(ticket);
    }

    public Boolean removeTicket(Ticket ticket) {
        return this.ticketsAdquiridos.remove(ticket);
    }
}
