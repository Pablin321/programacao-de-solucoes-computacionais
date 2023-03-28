package programacao_solucao_computacional;
import java.util.Scanner;
public class Atv11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, i, p;
		
		i = 0;
		p = 10;
		
		System.out.print("Informe um numero: ");
		n = input.nextInt();
		
		while (i < p) {
			System.out.println(n + "x" + (i+1) + "=" + ((i+1) * n) + " ");
			i=i+1;			
		}
		
		System.exit(0);
		
	}

}
