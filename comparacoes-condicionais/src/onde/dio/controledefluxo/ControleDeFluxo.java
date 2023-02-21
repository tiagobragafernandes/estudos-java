package onde.dio.controledefluxo;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        nomeDoMes();
        switchDiaDaSemana();
    }
    private static void nomeDoMes() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número do mês: ");
            String numeroDoMes = scanner.next();

            if(numeroDoMes.equals("1")){
                System.out.println("Janeiro");
                System.out.println("Mês de férias");
            }else if(numeroDoMes.equals("2")){
                System.out.println("Fevereiro");
            }else if(numeroDoMes.equals("3")){
                System.out.println("Março");
            }else if(numeroDoMes.equals("4")){
                System.out.println("Abril");
            }else if(numeroDoMes.equals("5")){
                System.out.println("Maio");
            }else if(numeroDoMes.equals("6")){
                System.out.println("Junho");
            }else if(numeroDoMes.equals("7")){
                System.out.println("Julho");
                System.out.println("Mês de férias");
            }else if(numeroDoMes.equals("8")){
                System.out.println("Agosto");
            }else if(numeroDoMes.equals("9")){
                System.out.println("Setembro");
            }else if(numeroDoMes.equals("10")){
                System.out.println("Outubro");
            }else if(numeroDoMes.equals("11")){
                System.out.println("Novembro");
            }else if(numeroDoMes.equals("12")){
                System.out.println("Dezembro");
                System.out.println("Mês de férias");
            }

        }

    private static void switchDiaDaSemana(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o dia da semana: ");
        String diaDaSemana = scanner.next();


        switch (diaDaSemana){
            case "Segunda-feira":
                System.out.println("2");
            case "Terça-feira":
                System.out.println("3");
                break;
            case "Quarta-feira":
                System.out.println("4");
                break;
            case "Quinta-feira":
                System.out.println("5");
                break;
            case "Sexta-feira":
                System.out.println("6");
                break;
            case "Sábado":
                System.out.println("7");
                break;
            case "Domingo":
                System.out.println("1");
                break;
        }
    }
    }

