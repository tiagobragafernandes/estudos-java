import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero1 = 1;
        String numero2 = "2";
        System.out.println(numero1 + numero2);

        System.out.println("Digite a sua altura: ");
        String altura = scanner.next();
        System.out.println("Digite o seu peso: ");
        String peso = scanner.next();
        System.out.println("Digite a sua nome: ");
        String nome = scanner.next();

        System.out.println("O seu nome é: " + nome + ", " + "a sua altura é: " + altura + " e o seu peso é: " + peso + "Kg");

    }

}