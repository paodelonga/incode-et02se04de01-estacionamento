package maquina_de_ticket.Servico;

import maquina_de_ticket.Entidade.TabelaPreco;
import maquina_de_ticket.Entidade.Identificador;
import maquina_de_ticket.Entidade.Tarifa;
import maquina_de_ticket.Entidade.Ticket;
import maquina_de_ticket.Entidade.Vaga;

import maquina_de_ticket.Repositorio.EstacionamentoRepositorio;
import maquina_de_ticket.Repositorio.IdentificadorRepositorio;
import maquina_de_ticket.Repositorio.TicketRepositorio;
import maquina_de_ticket.Repositorio.VagaRepositorio;

import java.util.ArrayList;
import java.util.Arrays;

public class MaquinaDeTicketServico {
    private Identificador identificador;
    private TabelaPreco tabela_preco;
    private Ticket ticket;
    private Vaga vaga;

    private EstacionamentoRepositorio estacionamentoRepositorio;
    private IdentificadorRepositorio identificadorRepositorio;
    private TicketRepositorio ticketRepositorio;
    private VagaRepositorio vagaRepositorio;

    public MaquinaDeTicketServico() {
        TabelaPreco tabela_preco = new TabelaPreco(new ArrayList<>(Arrays.asList(
                new Tarifa((float) 24.00, "h", (float) 1.00),
                new Tarifa((float) 1.00, "d", (float) 2.00),
                new Tarifa((float) 32.00, "m", (float) 4.00)
        )));

        estacionamentoRepositorio = new EstacionamentoRepositorio(
                (short) 512,
                tabela_preco
        );

        vagaRepositorio = new VagaRepositorio(estacionamentoRepositorio.getQuantidadeVaga());
        identificadorRepositorio = new IdentificadorRepositorio();
        ticketRepositorio = new TicketRepositorio();
    }
}
