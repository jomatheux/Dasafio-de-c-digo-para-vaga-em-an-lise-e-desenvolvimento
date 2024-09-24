package org.example.desafio1;
//Este código realiza a soma dos números de 1 a 13. O valor final de SOMA será 91.
public class SomaIndice {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Valor de SOMA: " + SOMA);
    }
}
