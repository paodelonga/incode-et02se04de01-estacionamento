package maquina_de_ticket.Entidade;

import java.util.HashMap;

public class TabelaPreco {
    HashMap<String, Float> tabelaPreco;

    public TabelaPreco(HashMap<String, Float> tabela_preco) {
        tabelaPreco = tabela_preco;
    }

    public HashMap<String, Float> getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(HashMap<String, Float> tabela_preco) {
        tabelaPreco = tabela_preco;
    }
}
