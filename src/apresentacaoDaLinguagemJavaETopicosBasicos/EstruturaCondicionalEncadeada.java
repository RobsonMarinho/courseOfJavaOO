package apresentacaoDaLinguagemJavaETopicosBasicos;

import java.util.Scanner;

public class EstruturaCondicionalEncadeada {
	/*if (Time < 12)
	 * What time is it? 
	 * 10 
	 * Good morning!
	 * 
	 * if (12 <= time<18)
	 * What time is it? 
	 * 14 
	 * Good afternoon!
	 * 
	 * if(time>=18)
	 * What time is it? 
	 * 19 
	 * Good evening!
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What time is it? ");
		int time = sc.nextInt();
		
		if  (time < 12) {
			System.out.println("Good morning!");
		}
		else if (time < 18) {
			System.out.println("Good afternoon!");
		}
		else {
			System.out.println("Good evening!");
		}
		
		sc.close();
	
	}

}
