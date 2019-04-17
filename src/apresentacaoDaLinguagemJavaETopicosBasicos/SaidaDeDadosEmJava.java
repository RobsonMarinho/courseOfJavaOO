package apresentacaoDaLinguagemJavaETopicosBasicos;

import java.util.Locale;

public class SaidaDeDadosEmJava {

	public static void main(String[] args) {

		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Jones";

		System.out.print("Hello World");
		System.out.println("Good morning");
		System.out.println("Good Night");
		System.out.println("---------------------------------");
		System.out.printf("%.2f%n", balance); // Printf = formato && f = ponto
												// fluante
		System.out.printf("%.4f%n", balance); // O '%n' = quebra de linha
		Locale.setDefault(Locale.US); // Organiza os número para formato
										// americano
		System.out.printf("%.4f%n", balance);
		System.out.println("------------------------------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age, gender, balance); // Var number = %s && var
													// number = %d

	}

}
