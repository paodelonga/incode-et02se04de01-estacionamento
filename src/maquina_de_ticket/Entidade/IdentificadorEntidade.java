package maquina_de_ticket.Entidade;

public class IdentificadorEntidade {
    private String identificador_longo;
    private String identificador_curto;

    public IdentificadorEntidade(String identificador_longo) {
        this.identificador_longo = identificador_longo;
        this.identificador_curto = identificador_longo.split("-")[0];
    }

    public String getIdentificadorCurto() {
        return identificador_curto;
    }

    public String getIdentificadorLongo() {
        return identificador_longo;
    }

    public void setIdentificadorLongo(String identificador_longo) {
        this.identificador_longo = identificador_longo;
    }

    public void setIdentificadorCurto(String identificador_curto) {
        this.identificador_curto = identificador_curto;
    }
}
