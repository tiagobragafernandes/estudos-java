package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "texto";
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scanner.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scanner.nextInt();
        }

    }
}
