package apresentacaoDaLinguagemJavaETopicosBasicos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3; // Resto de divisão "Mod"
		double n4 = 10 / 8;

		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = -b + Math.sqrt(b * b - 4 * a * c) / 2 * a ;// Raiz quadrada no Java =
														// Math.sqrt()

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);

	}

}
