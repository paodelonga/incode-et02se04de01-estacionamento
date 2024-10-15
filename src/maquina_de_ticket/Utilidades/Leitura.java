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
        while (entradaLeitor.isBlank()) {
            entradaLeitor = leitorEntrada.nextLine();

            if(!entradaLeitor.isBlank()) {
                break;
            }
            leitorEntrada.nextLine();
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

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return lerInteiro();
    }

    public static float lerFloat(String mensagem) {
        System.out.print(mensagem);
        return lerFloat();
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return lerString();
    }

    public static boolean lerEnter(String mensagem) {
        System.out.print(mensagem);
        return lerEnter();
    }

}
