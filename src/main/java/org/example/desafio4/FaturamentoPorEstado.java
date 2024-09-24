package org.example.desafio4;
//Esse programa calcula o percentual de participação de cada estado no total de faturamento mensal.
public class FaturamentoPorEstado {

    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.println("Percentual SP: " + String.format("%.2f", calcularPercentual(sp, total)) + "%");
        System.out.println("Percentual RJ: " + String.format("%.2f", calcularPercentual(rj, total)) + "%");
        System.out.println("Percentual MG: " + String.format("%.2f", calcularPercentual(mg, total)) + "%");
        System.out.println("Percentual ES: " + String.format("%.2f", calcularPercentual(es, total)) + "%");
        System.out.println("Percentual Outros: " + String.format("%.2f", calcularPercentual(outros, total)) + "%");
    }

    public static double calcularPercentual(double valor, double total) {
        return (valor / total) * 100;
    }
}

