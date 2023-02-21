package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scanner.nextInt();

        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

             if(numero % 2 == 0){
                 quantPares++;
             }else{
                 quantImpares++;
             }

            count ++;

        }while (count < quantNumeros);

        System.out.println("A quantidade de números ímpares digitados é: " + quantImpares);
        System.out.println("A quantidade de números pares digitados é: " + quantPares);

    }
}
