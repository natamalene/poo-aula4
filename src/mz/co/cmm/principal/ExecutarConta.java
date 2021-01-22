package mz.co.cmm.principal;

import java.util.Scanner;

import mz.co.cmm.entidade.ContaBancaria;
public class ExecutarConta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		ContaBancaria conta = new ContaBancaria();
		
		   
		System.out.println("Informe o numero de conta");
		conta.numeroConta = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Informe o titular da conta");
		
		conta.titularDaConta = teclado.nextLine();
		
		System.out.println("Pretende fazer um deposito inicial agora(S/N)?: ");
		
		String letra = teclado.nextLine();
		
		if(letra.equals("s") || letra.equals("S")) {
			
			System.out.println("Informe o valor que deseja depositar: ");
			conta.saldo = teclado.nextDouble();
			
			System.out.println("Dados da Conta:");
			System.out.println(conta.toString());
		}
		else {
			
			System.out.println("Dados da Conta:");
			System.out.println(conta.toString());
			
		}
			
			System.out.println("Informe o valor que pretende depositar: ");
			double deposito = teclado.nextDouble();
			conta.depositar(deposito);
		
			System.out.println("Situacao actual da conta:");
			System.out.println(conta.toString());
			
		
		    System.out.println("Informe o valor que pretende levantar: ");
		    double levantamento = teclado.nextDouble();
		    conta.levantar(levantamento);
		
		    System.out.println("Situacao actual da conta do cliente:");
			System.out.println(conta.toString());
		
		
		
		teclado.close();
		
	}

}
