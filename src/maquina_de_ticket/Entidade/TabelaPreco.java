package maquina_de_ticket.Entidade;

import java.util.ArrayList;
import java.util.List;

public class TabelaPreco {
    List<Tarifa> tabelaPreco;

    public TabelaPreco(ArrayList<Tarifa> lista_tarifas) {
        tabelaPreco = lista_tarifas;
    }

    public List<Tarifa> getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(List<Tarifa> tabela_preco) {
        tabelaPreco = tabela_preco;
    }

    public void adicionaTarifa(Tarifa tarifa) {
        tabelaPreco.addLast(tarifa);
    }

    public void removeTarifa(Integer index) {
        tabelaPreco.remove(index);
    }

}
