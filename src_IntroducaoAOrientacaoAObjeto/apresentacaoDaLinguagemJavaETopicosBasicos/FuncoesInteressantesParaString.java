package apresentacaoDaLinguagemJavaETopicosBasicos;

public class FuncoesInteressantesParaString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG";

		String s01 = original.toLowerCase(); // Small letters
		String s02 = original.toUpperCase(); // Capital letters
		String s03 = original.trim(); // Take the space out
		String s04 = original.substring(2); // Pass as a parameter from the
											// second letter
		
		String s05 = original.substring(2, 9); // Displays from the second
												// letter to the ninth letter
		
		String s06 = original.replace('a', 'x'); // Change the vowel 'a' by the
													// consonant 'x'
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("subString(2): -" + s04 + "-");
		System.out.println("subString(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("last index of 'bc': " + j);
	
	}
}
