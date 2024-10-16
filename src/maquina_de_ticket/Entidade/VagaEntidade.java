package maquina_de_ticket.Entidade;

import java.time.LocalDateTime;

public class VagaEntidade {
    private Short identificador;
    private LocalDateTime tempoOcupacao;

    public VagaEntidade(Short identificador) {
        this.identificador = identificador;
    }

    public Short getIdentificador() {
        return identificador;
    }

    public LocalDateTime getTempoOcupacao() {
        return tempoOcupacao;
    }

    public void setIdentificador(Short identificador) {
        this.identificador = identificador;
    }

    public void setTempoOcupacao(LocalDateTime tempoOcupacao) {
        this.tempoOcupacao = tempoOcupacao;
    }
}
