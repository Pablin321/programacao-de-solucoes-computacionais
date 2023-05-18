package programacao_solucao_computacional.pratica_2;
import java.util.Scanner;
public class Atv11 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        int idade = input.nextInt();

        System.out.print("Digite o sexo do cliente (M - masculino, F - feminino): ");
        char sexo = input.next().charAt(0);

        double mensalidade = 0.0;

        if (sexo == 'M') { 
            if (idade <= 15) {
                mensalidade = 60.0;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.0;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.0;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.0;
            } else { 
                mensalidade = 80.0;
            }
        } else if (sexo == 'F') { 
            if (idade <= 18) {
                mensalidade = 60.0;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.0;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.0;
            } else { 
                mensalidade = 80.0;
            }
        } else { 
            System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
            System.exit(0); 
        }

        System.out.println("Valor da mensalidade a ser paga: R$ " + mensalidade);

        input.close();
    }

}
