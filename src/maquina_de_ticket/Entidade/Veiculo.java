package maquina_de_ticket.Entidade;

public class Veiculo {
    Categoria categoria;
    String placa;
    String modelo;

    public Veiculo(Categoria categoria, String placa, String modelo) {
        this.categoria = categoria;
        this.placa = placa;
        this.modelo = modelo;
    }
}
