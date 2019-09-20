package program;

import java.util.Locale;
import java.util.Scanner;

import entites.Conta;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
				
		System.out.print("Informe o númeor da conta: ");
		int nConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe o nome do títular: ");
		String nome = sc.nextLine();
		System.out.print("Irá realizar um depósito S/N: ");
		char c = sc.next().charAt(0);
		
		if (c == 's') {
			System.out.print("Informar o valor do depósito:");
			double dep = sc.nextDouble();
			conta = new Conta(nome, nConta, dep);
			System.out.println();
			System.out.println(conta);
			
		}else {
			conta = new Conta(nome, nConta);			
			System.out.println(conta);
			System.out.println();
		}
		
		System.out.print("Entre com um valor de depósito: ");
		double dep = sc.nextDouble();
		conta.deposito(dep);
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println(conta);
		
		sc.close();
	}

}
