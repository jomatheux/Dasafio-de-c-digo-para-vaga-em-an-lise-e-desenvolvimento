package org.example.desafio2;

import java.util.Scanner;
//Este programa calcula a sequência de Fibonacci até encontrar um número maior ou igual ao informado e verifica se ele pertence à sequência.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        sc.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int numero) {
        int a = 0, b = 1, soma = 0;
        while (soma < numero) {
            soma = a + b;
            a = b;
            b = soma;
        }
        return soma == numero || numero == 0;
    }
}
