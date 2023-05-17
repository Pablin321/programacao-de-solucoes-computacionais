package programacao_solucao_computacional.pratica_2;

import java.util.Scanner;

public class Atv7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		
		System.out.print("Informe o valor de a: ");
		a = input.nextDouble();
		
		System.out.print("Agora escreva o valor de b: ");
		b = input.nextDouble();
		
		System.out.print("E por último digite o valor de c: ");
		c = input.nextDouble();
		
		delta = (b*b) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / 2 * a;
		x2 = (-b - Math.sqrt(delta)) / 2 * a;
		
		if (a == 0 && b == 0 && c != 0)
			System.out.println("Coeficientes informados incorretamente");
		
		if (a == 0 && b != 0)
			System.out.println("Esta é uma equação de primeiro grau. Resultado: " + (-c / b));
		
		if (a != 0)
			System.out.println("Esta é uma equação de segundo grau");
		else if (delta < 0)
			System.out.println("Esta equação não possui raiz real");
		else if (delta == 0)
			System.out.println("Esta equação possui duas raízes reais iguais. "
					+ "Resultado: " + (-b / (2 * a)));
		else if (delta > 0)
			System.out.println("Esta equação possui duas raízes reais diferentes. \n" 
					+ "Valor x1: " + x1 + "\nValor x2: " + x2);
		
		System.exit(0);
		input.close();
		
		
		
	}

}
