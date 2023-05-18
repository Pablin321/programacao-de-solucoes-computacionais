package programacao_solucao_computacional.pratica_2;
import java.util.Scanner;
public class Atv10 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = input.nextInt();

        double valorDiaria = 500.0;
        double taxaServicos = 0.0;

        if (numDiarias < 15) {
            taxaServicos = 15.0;
        } else if (numDiarias == 15) {
            taxaServicos = 10.0;
        } else {
            taxaServicos = 5.0;
        }

        double total = (valorDiaria * numDiarias) + (taxaServicos * numDiarias);

        System.out.println("Total a ser pago: R$ " + total);

        input.close();
    }

}
