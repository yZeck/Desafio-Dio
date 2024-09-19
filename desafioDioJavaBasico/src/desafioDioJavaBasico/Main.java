package desafioDioJavaBasico;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Conta cliente = new Conta();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor! Digite o seu nome:");
		cliente.nomeCliente = scan.nextLine();
		
		System.out.println("Por favor! Digite o número da Agência:");
		cliente.agencia = scan.nextLine();
		
		System.out.println("Por favor! Digite o número da Conta:");
		cliente.numero = scan.nextInt();
		
		System.out.println(" Olá "+ cliente.nomeCliente + " obrigado por criar uma conta no nosso banco, sua agencia é "+ cliente.agencia + " conta "+ cliente.numero+ " e seu saldo "+ cliente.Saldo+" já está disponível para saque");
		
		
	}
}
