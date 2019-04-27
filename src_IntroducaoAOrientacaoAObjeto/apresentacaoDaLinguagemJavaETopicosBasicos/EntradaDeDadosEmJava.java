package apresentacaoDaLinguagemJavaETopicosBasicos;

import java.util.Scanner;

/*Atividades*/

// 1. Ler um texto até a quebra de linha e armazenar em uma variável!

// 2. Ler três palavras, uma em cada linha, armazenando cada uma em uma variável!

// 3. Ler três palavras na mesma linha, separadas por espaço, armazenando cada uma em uma variável!

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
