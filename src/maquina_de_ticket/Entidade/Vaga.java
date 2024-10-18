package maquina_de_ticket.Entidade;

import java.time.LocalDateTime;

public class Vaga {
    private Short numero;
    private LocalDateTime tempoOcupacao;

    public Vaga(Short numero_vaga) {
        numero = numero_vaga;
    }

    public Short getNumero() {
        return numero;
    }

    public LocalDateTime getTempoOcupacao() {
        return tempoOcupacao;
    }

    public void setNumero(Short numero_vaga) {
        numero = numero_vaga;
    }

    public void setTempoOcupacao(LocalDateTime tempo_ocupacao) {
        tempoOcupacao = tempo_ocupacao;
    }
}
