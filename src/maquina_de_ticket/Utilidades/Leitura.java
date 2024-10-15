package maquina_de_ticket.Utilidades;

import java.util.Scanner;

public class Leitura {

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
}
