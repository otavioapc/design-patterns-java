package observer_trabalho;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		EditoraConcreta editora = new EditoraConcreta();
		
		boolean laco = true;
		
		
		while(laco) {
			
			System.out.println("Deseja cadastrar um assinante?");
			System.out.println("1 - SIM");
			System.out.println("2 - NÃO");
			String opcao = Integer.toString(teclado.nextInt());
			
			if(Integer.parseInt(opcao) == 1) {
				
				System.out.println("Informe o nome do assinante:");
				String nome = teclado.nextLine();
				AssinanteConcreto assinante = new AssinanteConcreto(nome);
						
				System.out.println("Qual assinatura deseja?");
				System.out.println("1 - Esporte");
				System.out.println("2 - Politica");
				System.out.println("3 - Finanças");
				int assunto = teclado.nextInt();
				
				editora.assinarEditora(assinante, assunto);				
				
			}
			else if(Integer.parseInt(opcao) == 2 ) {
				
				laco = false;
				
			}
			else {
				
				System.out.println("Opção inválida");
				
			}
			
					
		}
		
	}

}
