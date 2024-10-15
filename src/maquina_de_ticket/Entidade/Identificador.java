package maquina_de_ticket.Entidade;

import java.util.UUID;

public class Identificador {
    private String identificador_longo;
    private String identificador_curto;

    public Identificador(String identificador_longo) {
        identificador_longo = identificador_longo;
        identificador_curto = identificador_longo.split("-")[0];
    }
}
