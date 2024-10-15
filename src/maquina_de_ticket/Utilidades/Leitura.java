package maquina_de_ticket.Utilidades;

import java.util.Scanner;

public class Leitura {
    /* TODO
    * - Validação dos tipo durante entrada
    *   - utilizar coisinhas recursivas para "forcar" o usuario
    *   a utilizar o tipo correto de dado
    *   - tratamento de execeptions
    *
    * */

    private static Scanner leitorEntrada = new Scanner(System.in);

    public static int lerInteiro() {
        return leitorEntrada.nextInt();
    }

    public static float lerFloat() {
        return leitorEntrada.nextFloat();
    }

    public static String lerString() {
        leitorEntrada = new Scanner(System.in);
        String entradaLeitor = leitorEntrada.nextLine();
        while (entradaLeitor.isEmpty()) {
            entradaLeitor = leitorEntrada.nextLine();

            if(!entradaLeitor.isEmpty()) {
                break;
            }
        }
        return entradaLeitor;
    }

    public static boolean lerEnter() {
        leitorEntrada = new Scanner(System.in);
        String entradaLeitor = leitorEntrada.nextLine();
        while (!entradaLeitor.isEmpty()) {
            entradaLeitor = leitorEntrada.nextLine();

            if(entradaLeitor.isEmpty()) {
                break;
            }
        }
        return true;
    }
}
