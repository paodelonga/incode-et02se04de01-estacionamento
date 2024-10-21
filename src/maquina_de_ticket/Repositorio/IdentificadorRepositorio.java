package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.Identificador;

import java.util.LinkedList;

public class IdentificadorRepositorio {
    private LinkedList<Identificador> identificadoresGerados;

    public IdentificadorRepositorio() {
        identificadoresGerados = new LinkedList<Identificador>();
    }

    public LinkedList<Identificador> getIdentificadoresGerados() {
        return identificadoresGerados;
    }

    public void setIdentificadoresGerados(LinkedList<Identificador> identificadores_gerados) {
        identificadoresGerados = identificadores_gerados;
    }

    public void adicionarIdentificador(Identificador identificador) {
        identificadoresGerados.add(identificador);
    }

    public void removerIdentificador(Identificador identificador) {
        identificadoresGerados.remove(identificador);
    }
}