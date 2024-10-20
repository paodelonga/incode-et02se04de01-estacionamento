package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.TabelaPreco;

public class EstacionamentoRepositorio {
    private Short quantidadeVaga;
    private TabelaPreco tabelaPreco;

    public EstacionamentoRepositorio(Short quantidade_vaga, TabelaPreco tabela_preco) {
        quantidadeVaga = quantidade_vaga;
        tabelaPreco = tabela_preco;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public Short getQuantidadeVaga() {
        return quantidadeVaga;
    }

    public void setTabelaPreco(TabelaPreco tabela_preco) {
        tabelaPreco = tabela_preco;
    }

    public void setQuantidadeVaga(Short quantidade_vaga) {
        quantidadeVaga = quantidade_vaga;
    }
}
