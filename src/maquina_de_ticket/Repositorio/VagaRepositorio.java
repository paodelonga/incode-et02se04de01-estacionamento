package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.Vaga;

import java.util.LinkedList;

public class VagaRepositorio {
    private LinkedList<Vaga> vagasAlugadas;

    public VagaRepositorio(Short quantidadeVagasDisponiveis) {
        vagasAlugadas = new LinkedList<Vaga>();
    }

    public LinkedList<Vaga> getVagasAlugadas() {
        return vagasAlugadas;
    }

    public void setVagasAlugadas(LinkedList<Vaga> vagas_ocupadas) {
        vagasAlugadas = vagas_ocupadas;
    }

    public Boolean adicionarVaga(Vaga vaga) {
        return vagasAlugadas.add(vaga);
    }

    public Boolean removerVaga(Vaga vaga) {
        return vagasAlugadas.remove(vaga);
    }
}
