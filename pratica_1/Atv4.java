package programacao_solucao_computacional.pratica_1;
import java.util.Scanner;
public class Atv4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, salario_final;
		
		System.out.print("Informe seu salário: ");
		salario = input.nextDouble();
		
		salario_final = salario + (salario * 0.25);
		
		System.out.printf("Seu novo salário é: R$%.2f .", (salario_final));
		
		System.exit(0);
		input.close();
		
	}

}
