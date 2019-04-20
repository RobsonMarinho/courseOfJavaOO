package apresentacaoDaLinguagemJavaETopicosBasicos;

import java.util.Scanner;

public class DebuggingComEclipse {
	/*
	 * Teclas de atalho: CTRL+SHIFT+B - Marcar/desmarcar breakpoint 
	 * F5-Executar
	 * um passo (entra na fun��o) 
	 * F6-Executar um passo (pula fun��o) 
	 * F7- Sair do
	 * m�todo em execu��o Logo STOP- Parar debug
	 * 
	 * Perspectiva Debug: 
	 * Aba importante: Variables
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	// Fun��o max
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
