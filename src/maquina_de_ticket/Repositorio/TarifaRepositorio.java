package maquina_de_ticket.Repositorio;

import maquina_de_ticket.Entidade.Tarifa;

import java.util.LinkedList;

public class TarifaRepositorio {
    LinkedList<Tarifa> tarifas;

    public TarifaRepositorio() {
        tarifas = new LinkedList<Tarifa>();
    }

    public LinkedList<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(LinkedList<Tarifa> tabela_preco) {
        tarifas = tabela_preco;
    }

    public Boolean addTarifa(Tarifa tarifa) {
        return tarifas.add(tarifa);
    }

    public Boolean removeTarifa(Tarifa tarifa) {
        return tarifas.remove(tarifa);
    }}
