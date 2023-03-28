package programacao_solucao_computacional;
import java.util.Scanner;
public class Atv15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double  peso, altura, imc;
		
		System.out.print("Informe seu peso (em KG): ");
		peso = input.nextDouble();
		System.out.print("Informe sua altura (Em M): ");
		altura = input.nextDouble();
		
		imc = peso / Math.pow(altura,2);
		
		System.out.printf("Seu IMC é: %.2f ", (imc));
		
		if (imc < 20)
			System.out.print("Você está Abaixo do Peso. ");
		else if (imc >=20 && imc < 25)
			System.out.print("Seu peso está Normal. ");
		else if (imc >= 25 && imc < 30)
			System.out.print("Você está com peso Acima do Normal.");
		else if (imc >= 30 && imc < 40)
			System.out.print("Você está com Obesidade.");
		else 
			System.out.print("Você está com Obesidade Mórbida. ");
		
		System.exit(0);
		
	}

}
