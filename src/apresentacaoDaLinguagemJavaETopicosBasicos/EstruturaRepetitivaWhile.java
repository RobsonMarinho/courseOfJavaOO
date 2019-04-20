package apresentacaoDaLinguagemJavaETopicosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {
	/*Problema exemplo: 
	 * Digitar um n�mero e mostrar sua raiz quadrada com tr�s
	 * casa decimais, depois repetir o procedimento. Quando o usu�rio digitar um
	 * n�mero negativo (podendo inclusive ser na primeira vez), mostrar uma
	 * mensagem"Negative number" e terminar o programa.
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double n = sc.nextDouble();
		
		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Enter another number: ");
			n = sc.nextDouble();
		}	
		System.out.println("Negative number");
				
		sc.close();
	}

}
