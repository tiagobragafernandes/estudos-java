package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int acc = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();
            if(numero > maior){
                maior = numero;
            }
            soma = soma + numero;
            acc++;
        }while (acc < 5);

        double media = (soma / 5);

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números digitados é: " + media);

    }
}
