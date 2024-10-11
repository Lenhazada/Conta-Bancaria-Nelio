package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	// CONSTRUTORES DE 2 ARGUMENTOS PARA CASO NÃO HAJA DEPOSITO INICIAL
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// CONSTRUTORES DE 3 ARGUMENTOS PARA CASO TENHA UM DEPOSITO INICIAL
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	// GATTERS AND SETTERS
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
	
	// OPERAÇÃO DE DEPOSITO ONDE ADICIONA O VALOR NA VARIAVEL AMOUNT
	public void deposit(double amount) {
		balance += amount;
	}
	// OPERAÇÃO DE DEPOSITO ONDE RETIRA UM VALOR DA CONTA COM O ACRESCIMO DE 5
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " 
				+ number
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance) ;
	}
	
}

