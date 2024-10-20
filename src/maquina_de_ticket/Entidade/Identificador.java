package maquina_de_ticket.Entidade;

import java.util.UUID;

public class Identificador {
    private String identificador;

    public Identificador(UUID identificador) {
        setIdentificador(identificador);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(UUID identificador) {
        this.identificador = identificador.toString().split("-")[0];
    }
}
