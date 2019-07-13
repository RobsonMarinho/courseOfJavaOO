package ApplicationCorrecaoAtividade;

import java.util.Locale;
import java.util.Scanner;

import entitiesCorrecaoAtividade.Account;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an innitial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter innitial deposit value: ");
			double innitialDeposit = sc.nextDouble();
			account = new Account(number, holder, innitialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		// Deposito
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);// Realiza o dep�sito na conta
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		// Saque
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);// Realiza o dep�sito na conta
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}
}
