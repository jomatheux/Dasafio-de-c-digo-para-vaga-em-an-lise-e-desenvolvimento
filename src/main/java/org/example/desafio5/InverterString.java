package org.example.desafio5;

import java.util.Scanner;

//Este programa inverte uma string sem usar funções prontas como reverse().
public class InverterString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = sc.nextLine();
        sc.close();

        String invertida = inverter(original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverter(String str) {
        StringBuilder invertida = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }
        return invertida.toString();
    }
}

