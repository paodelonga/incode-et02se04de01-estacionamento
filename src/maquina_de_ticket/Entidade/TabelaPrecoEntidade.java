package maquina_de_ticket.Entidade;

import java.util.HashMap;

public class TabelaPrecoEntidade {
    HashMap<String, Float> tabelaPreco;

    public TabelaPrecoEntidade(HashMap<String, Float> tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }

    public HashMap<String, Float> getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(HashMap<String, Float> tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }
}
