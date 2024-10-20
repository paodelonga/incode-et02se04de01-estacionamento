package maquina_de_ticket.Servico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterfaceServico {
    public static String gerarBoasVindas() {
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
}
