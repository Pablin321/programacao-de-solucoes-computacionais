package programacao_solucao_computacional.pratica_1;
import java.util.Scanner;
public class Atv10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double c, r, a, v;
		
		System.out.print("Informe o valor do raio: ");
		r = input.nextDouble();
		
		c = (2 * Math.PI) * r;
		a = (Math.PI * Math.pow(r, 2));
		v = (0.75 * Math.PI) * Math.pow(r, 3);
		
		System.out.print("O comprimento da esfera é de: " + c + 
				"\nA área é de: " + a + 
				"\nE o volume é: " + v );
		
		System.exit(0);
		input.close();
		
	}

}
