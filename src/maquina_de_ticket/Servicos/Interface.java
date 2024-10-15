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
        System.out.println(
            """
            Estas são as vagas disponíveis atualmente:
            1, 2, 18, 23, 26, 27, 28, 29, 30, 31, 32, 33, 34"""
        );
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

    }

    // TODO
    private static void alugarVaga() {
        exibirVagasDisponiveis();
        exibirEspacamento();
        exibirTabelaPrecos();

        System.out.println(
            """
             [1] Alugar uma vaga aletoria
             [2] Alugar uma vaga especifica
            """
        );
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

        if(Leitura.lerEnter()) {
            exibirTabelaPrecos();
            exibirEspacamento();

            boolean finalizar = false;

            while(!finalizar) {
                exibirOperecoes();

                switch(Leitura.lerInteiro()) {
                    case 1: // Listar vagas disponiveis
                        exibirSeparador();
                        exibirVagasDisponiveis();
                        exibirSeparador();
                        break;
                    case 2: // Exibir tabela de precos
                        exibirSeparador();
                        exibirTabelaPrecos();
                        exibirSeparador();
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
}
