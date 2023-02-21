package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while(nota > 10 ^ nota < 0){
            System.out.println("Nota inválida, digite novamente: ");
            nota = scanner.nextInt();
        }
    }
}
