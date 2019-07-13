package entitiesCorrecaoAtividade;

public class Account {

	private int number;
	private String holder;
	private double balance;

	// Construtor de 2 argumentos
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// Construtor de 3 argumentos
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount = 5.0;
	}
}
