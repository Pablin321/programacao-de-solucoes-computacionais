package programacao_solucao_computacional.pratica5;
import java.util.Scanner;
public class Atv6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 10;
        int somaIdades = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / quantidadePessoas;

        System.out.println("A média das idades é: " + media);
        
        scanner.close();
    }
}
