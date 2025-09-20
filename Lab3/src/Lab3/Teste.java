/**
 * 
 */
package Lab3;

import java.util.Scanner;

/**
 * 
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
GestorObra g = new GestorObra();
		
		Scanner input = new Scanner(System.in);
		int opção;
		
		do {
			System.out.println("Bem vindo ao catálogo do Museu");
			System.out.println("1. Registar obra");
			System.out.println("2. Imprimir todos os detalhes de todas as obras");
			System.out.println("3. Pesquisar por obra");
			System.out.println("4. Imprimir detalhes de obras por tela");
			System.out.println("5. Imprimir todos os detalhes de todas as obras de arte agrupadas por tipo, indicando o número total de cada tipo");
			System.out.println("6. Sair");
			System.out.println("Opção: ");
			opção = input.nextInt();
			
			switch(opção) {
			case 1:
				input.nextLine(); //limpar o buffer
				
				System.out.println("Título da obra a registar: ");
				String titulo = input.nextLine();
				System.out.println("Autor: ");
				String autor = input.nextLine();
				System.out.println("Ano de criação: ");
				int data = input.nextInt();
				Obra o = new Obra(titulo,autor,data);
				
				g.adicionarObra(o);
				System.out.println("Obra adicionada com sucesso");
				break;
				
			case 2:
				
				System.out.println("Catálogo das obras atuais");
				g.imprimirDetalhes();
				break;
				
			
		}
			
			
		
	
		}			
	

	}

}
