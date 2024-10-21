package maquina_de_ticket;

import maquina_de_ticket.Servico.InterfaceServico;
import maquina_de_ticket.Servico.MaquinaDeTicketServico;
import maquina_de_ticket.UI.InterfaceUI;

public class App {

    public static void main(String[] args) {
        // Definide a quanitdade de vagas
        Short QUANTIDADE_VAGAS = 512;

        // Declaracao da interface e servicos
        InterfaceUI INTERFACE;
        InterfaceServico INTERFACE_SERVICO;
        MaquinaDeTicketServico MAQUINA_DE_TICKET_SERVICO;

        // Instanciação de interface e servicos
        INTERFACE = new InterfaceUI();
        INTERFACE_SERVICO = new InterfaceServico();
        MAQUINA_DE_TICKET_SERVICO = new MaquinaDeTicketServico(QUANTIDADE_VAGAS);

        // Adiciona tarifas a máquina de ticket
        MAQUINA_DE_TICKET_SERVICO.adicionarTarifa(
            (float) 18.00, "h", (float) 1.00
        );
        MAQUINA_DE_TICKET_SERVICO.adicionarTarifa(
            (float) 22.00, "h", (float) 2.00
        );
        MAQUINA_DE_TICKET_SERVICO.adicionarTarifa(
            (float) 32.00, "h", (float) 3.00
        );
        MAQUINA_DE_TICKET_SERVICO.adicionarTarifa(
            (float) 2.50, "a/h", (float) 0.00
        );
        MAQUINA_DE_TICKET_SERVICO.adicionarTarifa(
            (float) 0.30, "a/m", (float) 0.00
        );

        // Carregamento de relações
        INTERFACE_SERVICO.setMaquinaDeTicketServico(MAQUINA_DE_TICKET_SERVICO);
        INTERFACE.setInterfaceServico(INTERFACE_SERVICO);
        INTERFACE.setMaquinaDeTicketServico(MAQUINA_DE_TICKET_SERVICO);

        // Inicializa interface
        INTERFACE.iniciarInterface();
    }
}
