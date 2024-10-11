package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		//Pergunta o numero da conta
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		//Pede o nome do proprietario da conta
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		//Pede se tem algum deposito inicial
		System.out.print("Is there an initial deposit (y/n)? ");
		char decision = sc.next().charAt(0); 
		
		//Se responder "y" ele vai pedir o valor de deposito e criar o objeto account com as respectivas respostas
		if(decision == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initiaDeposit = sc.nextDouble();
			account = new Account(number, holder, initiaDeposit);
		//Se não ele criará a conta sem nenhum saldo
		}else {
			account = new Account(number, holder);
		}

		//Exibindo informações sobre a conta com o toString
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		//Sistema de deposito que sera somado com o saldo existente
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Uptaded account data: ");
		System.out.println(account);

		//Sistema de saque que ira retirar o valor inserido da conta com o acrescimo de 5.0
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Uptaded account data: ");
		System.out.println(account);
		
		sc.close();
	}
}
