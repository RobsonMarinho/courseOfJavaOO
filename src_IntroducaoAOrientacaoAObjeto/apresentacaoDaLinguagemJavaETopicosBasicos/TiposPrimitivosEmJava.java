//Declara��o de pacote
package apresentacaoDaLinguagemJavaETopicosBasicos;

//Criando a classe
public class TiposPrimitivosEmJava {
	// Criando o main
	public static void main(String[] args) {

		boolean completed = false;
		char gender = 'F';
		char letter = '\u0041';
		byte n1 = 127;// Ocupa 8 bits da mem�ria
		int n2 = 126;// Ocupa 32 bits da mem�ria
		int n3 = 2147483647;// Ocupa 32 bits da mem�ria
		long n4 = 2147483648L;// Ocupa 64 bits da mem�ria
		float n5 = 4.5f; // Ocupa 32 bits da mem�ria
		double n6 = 4.5;

		// Exibir no console as varu�ves declaradas
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
	}

}
