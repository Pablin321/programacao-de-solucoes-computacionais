package programacao_solucao_computacional.pratica_2;

import java.util.Scanner;

public class Atv8 {

	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);

        System.out.println("Escolha um planeta:");
        System.out.println("1 - Terra");
        System.out.println("2 - Marte");
        System.out.println("3 - Lua");
        System.out.print("Opção: ");
        int planeta = input.nextInt();

        System.out.print("Digite a velocidade inicial (v0): ");
        double v0 = input.nextDouble();

        System.out.print("Digite o instante de tempo (t): ");
        double t = input.nextDouble();

        double g = 0.0;
        String nomePlaneta = "";

        switch (planeta) {
            case 1:
                g = 9.8; 
                nomePlaneta = "Terra";
                break;
            case 2:
                g = 3.71; 
                nomePlaneta = "Marte";
                break;
            case 3:
                g = 1.6; 
                nomePlaneta = "Lua";
                break;
            default:
                System.out.println("Opção inválida.");
                input.close();
                return;
        }

        double vt = v0 - g * t;
        double ht = v0 * t - 0.5 * g * t * t;

        System.out.println("No planeta " + nomePlaneta + ":");
        System.out.println("Velocidade no instante t (v(t)): " + vt + " m/s");
        System.out.println("Altura no instante t (h(t)): " + ht + " metros");

        input.close();
    
	}
}

