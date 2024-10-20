package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.Vaga;

import java.util.HashSet;

public class VagaRepositorio {
    private HashSet<Vaga> vagasAlugadas;
    private Short[] listaVagasDisponiveis;

    public VagaRepositorio(Short quantidadeVagasDisponiveis) {
        vagasAlugadas = new HashSet<Vaga>();
        listaVagasDisponiveis = new Short[quantidadeVagasDisponiveis];
    }

    public HashSet<Vaga> getVagasAlugadas() {
        return vagasAlugadas;
    }

    public void setVagasAlugadas(HashSet<Vaga> vagas_ocupadas) {
        vagasAlugadas = vagas_ocupadas;
    }

    public Short[] getListaVagasDisponiveis() {
        System.out.println(listaVagasDisponiveis);
        return listaVagasDisponiveis;
    }

    public void setListaVagasDisponiveis(Short[] vagas_disponiveis) {
        listaVagasDisponiveis = vagas_disponiveis;
    }

    public void adicionarVaga(Vaga vaga) {
        vagasAlugadas.add(vaga);
    }

    public void removerVaga(Vaga vaga) {
        vagasAlugadas.remove(vaga);
    }
}
