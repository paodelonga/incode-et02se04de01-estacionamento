package maquina_de_ticket.Servico;

import maquina_de_ticket.Utilidade.LeituraUtilidade;

public class InterfaceServico {
    /* TODO
    * - Utilizar regex para validar pattern matching nas operacoes
    * */

    public InterfaceServico(){
        iniciarSistema();
    }

    private static void exibirEspacamento() {
        System.out.print("\n");
    }

    private static void exibirSeparador() {
        System.out.println("\n====================================\n");
    }

    private static String obterBoasVindas() {
        return """
         Bem-vindo ao Estacionamento
        Hora atual: 00:00, 12/12/2024
             Pressione [Enter]""";
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
            | 2horas | 28.0 |
            | 3horas | 32.00 |
            | Adicional | 3.20/hora |
            | ====================== |"""
        );
    }

    private static void alugarNovoTicket() {
        obterInformacoesTicket("A");
    }

    // TODO
    private static void exibirInformacoesTicket() {
        String identificadorTicket = LeituraUtilidade.lerString("Digite o identificador do Ticket > ");
        exibirEspacamento();

        obterInformacoesTicket(identificadorTicket);
    }

    private static void obterInformacoesTicket(String identificador) {
        String identificadorTicket = identificador;

        System.out.println(
        """
        Informações sobre o Ticket
        Ticket ID: abc123u
        Vaga Ocupada: 102
        Preço total: R$ 210"""
        );
    }

    // TODO
    private static void alugarVaga() {
        boolean finalizar_alugel = false;
        int mediaTempo;
        int vagaDesejada;

        exibirTabelaPrecos();
        exibirEspacamento();

        System.out.println(
            """
            [1] Alugar uma vaga aletoria
            [2] Alugar uma vaga especifica
            [3] Retroceder\n"""
        );

        while (!finalizar_alugel) {
            switch(LeituraUtilidade.lerInteiro()) {
                case 1:
                    exibirSeparador();
                    mediaTempo = LeituraUtilidade.lerInteiro(
                       """
                        Por quanto gostaria de ficar (em media)?
                        Digite o tempo em minutos >\s"""
                    );

                    exibirEspacamento();
                    System.out.println("Vaga alugada com sucesso!");
                    exibirEspacamento();

                    // TODO
                    // esse cara deve ser chamado por criar novo ticket
                    alugarNovoTicket();

                    finalizar_alugel = true;
                    break;
                case 2:
                    exibirSeparador();
                    exibirVagasDisponiveis();
                    exibirEspacamento();

                    mediaTempo = LeituraUtilidade.lerInteiro(
                            """
                             Por quanto gostaria de ficar (em media)?
                             Digite o tempo em minutos >\s"""
                    );

                    vagaDesejada = LeituraUtilidade.lerInteiro(
                            "Digite o número da vaga desejada > "
                    );
                    exibirEspacamento();

                    System.out.println("Vaga alugada com sucesso!");
                    exibirEspacamento();

                    // TODO
                    // esse cara deve ser chamado por criar novo ticket
                    alugarNovoTicket();
                    finalizar_alugel = true;
                    break;
                case 3:
                    finalizar_alugel = true;
                    break;
            };
        }
    }

    // TODO
    private static void pagarTicket() {
    String identificadorTicket;
    boolean finalizar_pagamento = false;

        while (!finalizar_pagamento) {
            exibirSeparador();
            identificadorTicket = LeituraUtilidade.lerString("Digite o identificador do Ticket > ");

            exibirEspacamento();
            obterInformacoesTicket(identificadorTicket);
            exibirEspacamento();

            System.out.println(
                """
                [1] Pagar
                [2] Retroceder\n"""
            );

            switch(LeituraUtilidade.lerInteiro()) {
                case 1:
                    exibirSeparador();
                    System.out.println("Ticket abc123u no valor de R$ 210 foi pago com sucesso!");
                    finalizar_pagamento = true;
                    break;
                case 2:
                    finalizar_pagamento = true;
                    break;
            }
            exibirSeparador();
        }

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
            [6] Sair do sistema"""
        );
    }

    public static void iniciarSistema() {
        if(LeituraUtilidade.lerEnter(obterBoasVindas())) {
            exibirSeparador();
            exibirTabelaPrecos();
            exibirEspacamento();

            boolean finalizar_sistema = false;

            while(!finalizar_sistema) {
                exibirOperecoes();
                exibirEspacamento();

                switch(LeituraUtilidade.lerInteiro()) {
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
                        exibirSeparador();
                        exibirInformacoesTicket();
                        exibirSeparador();
                        break;
                    case 4: // Alugar uma vaga
                        exibirSeparador();
                        alugarVaga();
                        exibirSeparador();
                        break;
                    case 5: // Pagar um Ticket
                        pagarTicket();
                        break;
                    case 6: // Sair do sistema
                        finalizar_sistema = true;
                        break;

                    default:
                        System.out.println("default");
                        break;
                }
            }
        }
    }
}
