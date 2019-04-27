package apresentacaoDaLinguagemJavaETopicosBasicos;

public class ConvervsaoImplicitaECasting {
	public static void main(String[] args) {
		
		int a;
		double result;
		String s = "33";
		
		a = Integer.parseInt(s);
		
		result = Double.parseDouble(s);
		
		System.out.println(a);
		System.out.println(result);
	}
}
