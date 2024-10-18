package maquina_de_ticket.Servico;

import maquina_de_ticket.Utilidade.LeituraUtilidade;
import maquina_de_ticket.Utilidade.Interface;

public final class InterfaceServico {
    // TODO
    private static String obterBoasVindas() {
        return """
         Bem-vindo ao Estacionamento
        Hora atual: 00:00, 12/12/2024
             Pressione [Enter]""";
    }

    private static void exibirOperacoes() {
        System.out.println(
            """
            [>] Operações disponíveis.
            [1] Listar vagas disponíveis
            [2] Exibir tabela de preços
            [3] Listar informações de um Ticket
            [4] Alugar uma vaga
            [5] Pagar um Ticket
            [6] Sair do sistema"""
        );
    }

    // TODO
    private static void exibirVagasDisponiveis() {
        System.out.println(
            """
            [>] Estas são as vagas disponíveis atualmente:
            1, 2, 18, 23, 26, 27, 28, 29, 30, 31, 32, 33, 34"""
        );
    }

    // TODO
    private static void exibirTabelaPrecos() {
        System.out.println(
            """
            [>] Esta é a nossa tabela de preços
            | ====================== |
            | Tempo | Preço |
            | ------------- |
            | 1hora | 24.00 |
            | 2horas | 28.0 |
            | 3horas | 32.00 |
            | Adicional | 3.20/hora |
            | ====================== |"""
        );
    }

    // TODO
    private static void alugarNovoTicket() {
        obterInformacoesTicket("A");
    }

    // TODO
    private static void exibirInformacoesTicket() {
        String identificadorTicket = LeituraUtilidade
                .lerString("[<] Digite o identificador do seu Ticket: ");
        Interface.exibirEspacamento();

        obterInformacoesTicket(identificadorTicket);
    }

    private static void obterInformacoesTicket(String identificador) {
        System.out.println(
        """
        [>] Informações sobre o Ticket
        Identificador do Ticket: asd123f
        Vaga ocupada: 98
        Preço total: R$ 90"""
        );
    }

    // TODO
    private static void alugarVaga() {
        boolean finalizarAlugel = false;

        int mediaTempo;
        int vagaDesejada;

        while (!finalizarAlugel) {
            exibirTabelaPrecos();
            Interface.exibirEspacamento();

            System.out.println(
                    """
                    [>] Operações disponíveis
                    [1] Alugar uma vaga aletoria
                    [2] Alugar uma vaga especifica
                    [3] Retroceder\n"""
            );

            /* TODO
            * As 21h:25min:25sec de 17 de Out de 2024 eu percebi a
            * descenessidade de ter exatamente quase igualmente igualitaria
            * dois escopos com quase que OS MESMOS CÓDIGOS E LÓGICAS
            * sendo duplicads PARA FAZER UMA COISA
            *
            *
            * provavelmente em 18 de Out de 2024 a partir das 10h:30min eu deva
            * consertar isto.
            * */
            switch(LeituraUtilidade.lerInteiro("[<] Digite o número da operação: ")) {
                case 1:
                    Interface.exibirSeparador();
                    mediaTempo = LeituraUtilidade.lerInteiro(
                       """
                        [>] Por quanto tempo gostaria de ficar?
                        [<] Digite o tempo em minutos (ex: 60):\s"""
                    );

                    Interface.exibirEspacamento();
                    System.out.println("[>] Vaga alugada com sucesso.");
                    Interface.exibirEspacamento();

                    // TODO
                    // esse cara deveria ser chamado por criar novo ticket
                    alugarNovoTicket();

                    finalizarAlugel = true;
                    break;
                case 2:
                    Interface.exibirSeparador();
                    exibirVagasDisponiveis();
                    Interface.exibirEspacamento();

                    mediaTempo = LeituraUtilidade.lerInteiro(
                            """
                             [>] Por quanto tempo gostaria de ficar?
                             [<] Digite o tempo em minutos (ex: 60):\s"""
                    );

                    vagaDesejada = LeituraUtilidade.lerInteiro(
                            "[<] Digite o número da vaga desejada: "
                    );
                    Interface.exibirEspacamento();

                    System.out.println("[>] Vaga alugada com sucesso");
                    Interface.exibirEspacamento();

                    // TODO
                    // esse cara deve ser chamado por criar novo ticket
                    alugarNovoTicket();
                    finalizarAlugel = true;
                    break;
                case 3:
                    finalizarAlugel = true;
                    break;
                default:
                    System.out.println("\n[ERRO]: Uma opção inexistente foi selecionada.\n");
                    break;
            };
        }
    }

    // TODO
    private static void pagarTicket() {
        boolean finalizar_pagamento = false;
        String identificadorTicket = LeituraUtilidade.lerString("[>] Digite o identificador do Ticket: ");;

        while (!finalizar_pagamento) {
            Interface.exibirSeparador();
            obterInformacoesTicket(identificadorTicket);
            Interface.exibirEspacamento();

            System.out.println(
                """
                [1] Pagar
                [2] Retroceder\n"""
            );

            switch(LeituraUtilidade.lerInteiro()) {
                case 1:
                    Interface.exibirSeparador();
                    System.out.println("[>] Ticket abc123u no valor de R$ 210 foi pago com sucesso.");
                    Interface.exibirSeparador();
                    finalizar_pagamento = true;
                    break;
                case 2:
                    Interface.exibirSeparador();
                    finalizar_pagamento = true;
                    break;
                default:
                    System.out.println("\n[ERRO]: Uma opção inexistente foi selecionada.");
                    break;
            }
        }

    }

    public static void iniciarSistema() {
        if(LeituraUtilidade.lerEnter(obterBoasVindas())) {
            Interface.exibirSeparador();
            exibirTabelaPrecos();
            Interface.exibirEspacamento();

            boolean finalizar_sistema = false;

            while(!finalizar_sistema) {
                exibirOperacoes();
                Interface.exibirEspacamento();

                switch(LeituraUtilidade.lerInteiro("[<] Digite o número da operação: ")) {
                    case 1: // Listar vagas disponiveis
                        Interface.exibirSeparador();
                        exibirVagasDisponiveis();
                        Interface.exibirSeparador();
                        break;
                    case 2: // Exibir tabela de precos
                        Interface.exibirSeparador();
                        exibirTabelaPrecos();
                        Interface.exibirSeparador();
                        break;
                    case 3: // Listar informacoes de um Ticket
                        Interface.exibirSeparador();
                        exibirInformacoesTicket();
                        Interface.exibirSeparador();
                        break;
                    case 4: // Alugar uma vaga
                        Interface.exibirSeparador();
                        alugarVaga();
                        Interface.exibirSeparador();
                        break;
                    case 5: // Pagar um Ticket
                        pagarTicket();
                        break;
                    case 6: // Sair do sistema
                        finalizar_sistema = true;
                        break;
                    default:
                        System.out.println("\n[ERRO]: Uma opção inexistente foi selecionada.\n");
                        break;
                }
            }
        }
    }
}
