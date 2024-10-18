package maquina_de_ticket.Entidade;

public class Identificador {
    private String identificadorLongo;
    private String identificadorCurto;

    public Identificador(String identificador_longo) {
        identificadorLongo = identificador_longo;
        identificadorCurto = identificador_longo.split("-")[0];
    }

    public String getIdentificadorCurto() {
        return identificadorCurto;
    }

    public String getIdentificadorLongo() {
        return identificadorLongo;
    }

    public void setIdentificadorLongo(String identificador_longo) {
        identificadorLongo = identificador_longo;
    }

    public void setIdentificadorCurto(String identificador_curto) {
        identificadorCurto = identificador_curto;
    }
}
