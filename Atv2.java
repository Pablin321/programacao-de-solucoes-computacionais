package programacao_solucao_computacional;
import java.util.Scanner;
import java.time.YearMonth;
public class Atv2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int nascimento, idade, idade_2050;
	
	int year = YearMonth.now().getYear();	
	
	System.out.print("Informe seu ano de nascimento: ");
	nascimento = input.nextInt();
	
	idade = year - nascimento;	
	idade_2050 = 2050 - nascimento;
	
	System.out.println("Sua idade atual é: " + idade  + 
			"\nEm 2050 você terá: " + idade_2050 + ".");

	System.exit(0);
	
	}

}
