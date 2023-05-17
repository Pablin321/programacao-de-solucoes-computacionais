package programacao_solucao_computacional.pratica_2;

import java.util.Scanner;

public class Atv6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double x, y, z;
		
		System.out.print("Informe o primeiro valor: ");
		x = input.nextDouble();
		
		System.out.print("Informe o primeiro valor: ");
		y = input.nextDouble();
		
		System.out.print("Informe o primeiro valor: ");
		z = input.nextDouble();
		
		if (y - z < x && y + z > x && x - z < y && x + z > y && x - y < z && x + y > z)
			System.out.println("Os três valores podem ser comprimento dos lados de um triângulo");
			else
				System.out.println("Os três valores não podem ser o "
						+ "comprimento dos lados de um triângulo");
		
			
		System.exit(0);
		input.close();
		
	}

}
