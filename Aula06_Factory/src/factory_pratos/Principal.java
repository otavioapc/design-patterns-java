package factory_pratos;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner mahomes = new Scanner(System.in);
		
		System.out.println("Digite seu nome e preferência de Prato");
		String nome = mahomes.nextLine();
		char preferencia = mahomes.next().charAt(0);
		
		Cliente cliente = new Cliente(nome, preferencia);
		Prato prato = PratoFactory.get(cliente);
		System.out.println(cliente.getNome());
		System.out.println(prato.toString());
		
	}

}
