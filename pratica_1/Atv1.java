package programacao_solucao_computacional.pratica_1;
import java.util.Scanner;
public class Atv1 {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo a calculadora de media.");
		
		Scanner input = new Scanner (System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.print("Digite a terceira nota: ");		
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("A média de notas é: %.2f .", (media));
		
		System.exit(0);
		input.close();
		
	}

}
