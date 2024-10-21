package maquina_de_ticket.Repositorio;


public class EstacionamentoRepositorio {
    private Short quantidadeVaga;
    private Short[] listaVagasDisponiveis;

    public EstacionamentoRepositorio(Short quantidade_vaga) {
        quantidadeVaga = quantidade_vaga;
        listaVagasDisponiveis = new Short[quantidade_vaga];
    }

    public Short getQuantidadeVaga() {
        return quantidadeVaga;
    }

    public Short[] getListaVagasDisponiveis() {
        return listaVagasDisponiveis;
    }

    public void setQuantidadeVaga(Short quantidade_vaga) {
        quantidadeVaga = quantidade_vaga;
    }

    public void setListaVagasDisponiveis(Short[] lista_vagas_disponiveis) {
        listaVagasDisponiveis = lista_vagas_disponiveis;
    }
}
