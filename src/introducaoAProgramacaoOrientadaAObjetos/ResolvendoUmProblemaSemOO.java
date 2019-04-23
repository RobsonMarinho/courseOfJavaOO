package introducaoAProgramacaoOrientadaAObjetos;

import java.util.Locale;
import java.util.Scanner;

//Alterado para OO
public class ResolvendoUmProblemaSemOO {

	public static void main(String[] args) {
		// Ler dois lados de triângulos X e Y

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo x, y;
		x = new CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo();
		y = new CriandoUmaClasseComTresAtributosParaRepresentarMelhorOTriangulo();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area(); // Chama método
		double areaY = y.area();

		System.out.printf("Triangule X area: %.4f%n", areaX);
		System.out.printf("Triangule Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}

}
