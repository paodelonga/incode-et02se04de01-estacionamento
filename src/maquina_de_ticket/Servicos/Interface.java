package maquina_de_ticket.Servicos;

import maquina_de_ticket.Utilidades.Leitura;

public class Interface {

    public Interface(){
        this.iniciar();
    }

    private static void exibirEspacamento() {
        System.out.print("\n");
    }

    private static void exibirSeparador() {
        System.out.println("\n====================================\n");
    }

    private static void exibirBoasVindas() {
        System.out.println(
            """
             Bem-vindo ao Estacionamento
            Hora atual: 00:00, 12/12/2024
                 Pressione [Enter]"""
        );
    }

    // TODO
    private static void exibirVagasDisponiveis() {
        System.out.println("");
    }

    private static void exibirTabelaPrecos() {
        System.out.println(
            """
            Esta é a nossa tabela de preços
            | Tabela de Preços |
            | Tempo | Preço |
            | 1hora | 24.00 |
            | 2horas | 28.0cSt0 |
            | 3horas | 32.00 |
            | Adicional | 3.20/hora |
            | ====================== |"""
        );
    }

    // TODO
    private static void exibirInformacoesTicket() {
        System.out.println("");
    }

    // TODO
    private static void alugarVaga() {
        System.out.println("");
    }

    // TODO
    private static void pagarTicket() {
        System.out.println("");
    }

    private static void exibirOperecoes() {
        System.out.println(
            """
            Escolha uma operação
            [1] Listar vagas disponíveis
            [2] Exibir tabela de preços
            [3] Listar informações de um Ticket
            [4] Alugar uma vaga
            [5] Pagar um Ticket
            [6] Sair do sistema
            """
        );
    }

    // TODO
    private static void finalizarSistema() {
        System.out.println("");
    }

    public static void iniciar() {
        exibirBoasVindas();
        exibirSeparador();
        exibirTabelaPrecos();
        exibirEspacamento();

        boolean finalizar = false;

        while(!finalizar) {
            exibirOperecoes();

            switch(Leitura.lerInteiro()) {
                case 1: // Listar vagas disponiveis
                    exibirVagasDisponiveis();
                    break;
                case 2: // Exibir tabela de precos
                    exibirTabelaPrecos();
                    exibirEspacamento();
                    break;
                case 3: // Listar informacoes de um Ticket
                    exibirInformacoesTicket();
                    break;
                case 4: // Alugar uma vaga
                    alugarVaga();
                    break;
                case 5: // Pagar um Ticket
                    pagarTicket();
                    break;
                case 6: // Sair do sistema
                    finalizarSistema();
                    finalizar = true;
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }
}
