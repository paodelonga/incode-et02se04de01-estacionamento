package maquina_de_ticket.Entidade;

public class Tarifa {
    private Float valor;
    private String unidade;
    private Float tempo;

    public Tarifa(Float valor, String unidade, Float tempo) {
        this.valor = valor;
        this.unidade = unidade;
        this.tempo = tempo;
    }

    public Float getValor() {
        return valor;
    }

    public String getUnidade() {
        return unidade;
    }

    public Float getTempo() {
        return tempo;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setTempo(Float tempo) {
        this.tempo = tempo;
    }
}
