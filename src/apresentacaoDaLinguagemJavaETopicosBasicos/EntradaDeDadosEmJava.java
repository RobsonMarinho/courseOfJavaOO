package apresentacaoDaLinguagemJavaETopicosBasicos;

import java.util.Scanner;

/*Atividades*/

// 1. Ler um texto at� a quebra de linha e armazenar em uma vari�vel!

// 2. Ler tr�s palavras, uma em cada linha, armazenando cada uma em uma vari�vel!

// 3. Ler tr�s palavras na mesma linha, separadas por espa�o, armazenando cada uma em uma vari�vel!

public class EntradaDeDadosEmJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
