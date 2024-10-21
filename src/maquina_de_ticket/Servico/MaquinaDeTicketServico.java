package maquina_de_ticket.Servico;

import maquina_de_ticket.Entidade.Identificador;
import maquina_de_ticket.Entidade.Tarifa;
import maquina_de_ticket.Entidade.Ticket;
import maquina_de_ticket.Entidade.Vaga;

import maquina_de_ticket.Repositorio.*;

import java.util.LinkedList;

public class MaquinaDeTicketServico {
    private Identificador identificador;
    private Ticket ticket;
    private Vaga vaga;

    private EstacionamentoRepositorio repositorioEstacionamento;
    private IdentificadorRepositorio repositorioIdentificador;
    private TarifaRepositorio repositorioTarifa;
    private TicketRepositorio repositorioTicket;
    private VagaRepositorio repositorioVaga;

    public MaquinaDeTicketServico(Short quantidade_vagas) {
        repositorioEstacionamento = new EstacionamentoRepositorio(
            quantidade_vagas
        );

        repositorioVaga = new VagaRepositorio(
            repositorioEstacionamento.getQuantidadeVaga()
        );

        repositorioIdentificador = new IdentificadorRepositorio();
        repositorioTicket = new TicketRepositorio();
        repositorioTarifa = new TarifaRepositorio();
    }

    public void adicionarTarifa(Tarifa tarifa) {
        repositorioTarifa.addTarifa(tarifa);
    }
    public void adicionarTarifa(Float valor, String unidade, Float tempo) {
        repositorioTarifa.addTarifa(new Tarifa(valor, unidade, tempo));
    }

    public void removerTarifa(Tarifa tarifa) {
        repositorioTarifa.removeTarifa(tarifa);
    }

    public LinkedList<Tarifa> obterTarifas() {
        return repositorioTarifa.getTarifas();
    }
}
