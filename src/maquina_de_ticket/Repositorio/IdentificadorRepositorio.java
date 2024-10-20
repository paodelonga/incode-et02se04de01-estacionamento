package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.Identificador;

import java.util.HashSet;

public class IdentificadorRepositorio {
    private HashSet<Identificador> identificadoresGerados;

    public IdentificadorRepositorio() {
        identificadoresGerados = new HashSet<Identificador>();
    }

    public HashSet<Identificador> getIdentificadoresGerados() {
        return identificadoresGerados;
    }

    public void setIdentificadoresGerados(HashSet<Identificador> identificadores_gerados) {
        identificadoresGerados = identificadores_gerados;
    }

    public void adicionarIdentificador(Identificador identificador) {
        identificadoresGerados.add(identificador);
    }

    public void removerIdentificador(Identificador identificador) {
        identificadoresGerados.remove(identificador);
    }
}