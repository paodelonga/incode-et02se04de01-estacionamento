package maquina_de_ticket.Servico;

import maquina_de_ticket.Entidade.Tarifa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;

public class InterfaceServico {
    private MaquinaDeTicketServico maquinaDeTicketServico;

    public void setMaquinaDeTicketServico(MaquinaDeTicketServico maquina_de_ticket_servico) {
        this.maquinaDeTicketServico = maquina_de_ticket_servico;
    }

    public String gerarBoasVindas() {
        return String.format(
            """
                 Bem-vindo ao Estacionamento
                Hora atual: %s
                     Pressione [Enter]""",
            LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("H:mm:ss dd/MM/yyyy")
            )
        );
    }

    public String gerarTabelaDePrecos() {
        LinkedList<Tarifa> tarifasObtidas = maquinaDeTicketServico.obterTarifas();
        Iterator<Tarifa> iterador = tarifasObtidas.iterator();

        String separador = "| ========================= |";
        String tabelaFormatada = "";
        String tempoTarifa = "";

        tabelaFormatada += separador + "\n";
        tabelaFormatada += "| Tempo | Preço |\n";

        while (iterador.hasNext()) {
            Tarifa tarifa = iterador.next();

            if (tarifa.getUnidade() == "m") {
                tempoTarifa = String.format(
                    "%.2f%s",
                    tarifa.getTempo(),
                    tarifa.getUnidade()
                );
            } else if (tarifa.getUnidade() == "h") {
                tempoTarifa = String.format(
                    "%.2f%s",
                    tarifa.getTempo(),
                    tarifa.getUnidade()
                );
            } else if (tarifa.getUnidade() == "d") {
                tempoTarifa = String.format(
                    "%.2f%s",
                    tarifa.getTempo(),
                    tarifa.getUnidade()
                );
            } else if (tarifa.getUnidade() == "a/m") {
                tempoTarifa = "Adicional/Min";
            } else if (tarifa.getUnidade() == "a/h") {
                tempoTarifa = "Adicional/Hora";
            } else if (tarifa.getUnidade() == "a/d") {
                tempoTarifa = "Adicional/Dia";
            }

            tabelaFormatada += String.format(
                "| %s | R$ %.2f |\n",
                tempoTarifa,
                tarifa.getValor()
            );
        }

        tabelaFormatada += separador;

        return tabelaFormatada;
    }
}
