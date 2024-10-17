package maquina_de_ticket.Entidade;

import java.util.HashMap;

public class TabelaPreco {
    HashMap<String, Float> tabelaPreco;

    public TabelaPreco(HashMap<String, Float> tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }

    public HashMap<String, Float> getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(HashMap<String, Float> tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }
}
