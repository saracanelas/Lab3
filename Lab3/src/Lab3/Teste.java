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
			System.out.println("\nBem vindo ao catálogo do Museu");
			System.out.println("1. Registar obra");
			System.out.println("2. Imprimir todos os detalhes de todas as obras");
			System.out.println("3. Pesquisar por obra");
			System.out.println("4. Imprimir detalhes de obras por tela");
			System.out.println("5. Imprimir todos os detalhes de todas as obras de arte agrupadas por tipo, indicando o número total de cada tipo");
			System.out.println("0. Sair");
			System.out.println("Opção: ");
			opção = input.nextInt();
			
			switch(opção) {
			case 1:
				input.nextLine(); //limpar o buffer
				
				System.out.println("Que tipo de obra deseja registar?");
			    System.out.println("1 - Escultura");
			    System.out.println("2 - Pintura");
			    System.out.println("3 - Pintura a Óleo");
			    
			    int tipo = input.nextInt();
			    input.nextLine(); // limpar buffer
				
				System.out.println("Título da obra a registar: ");
				String titulo = input.nextLine();
				System.out.println("Autor: ");
				String autor = input.nextLine();
				System.out.println("Ano de criação: ");
				int data = input.nextInt();
				input.nextLine(); //limpar o buffer
				
				Obra o = null;
				
				if(tipo==1) {
					System.out.println("Material: ");
					String material = input.nextLine();
					o = new Escultura(titulo,autor,data,material);
				}
				
				else if(tipo==2) {
					System.out.println("Técnica: ");
					String tecnica = input.nextLine();
					o = new Pintura(titulo,autor,data,tecnica);
				}
				
				else if(tipo==3) {
					System.out.println("Técnica: ");
					String tecnica = input.nextLine();
					System.out.println("Tipo de tela:");
					String tipoTela = input.nextLine();
					o = new PinturaOleo(titulo,autor,data,tecnica,tipoTela);
				}
				
				else {
					System.out.println("Opção inválida");
				}
				
				boolean adicionada = g.adicionarObra(o);
				if(adicionada) {
					System.out.println("Obra adicionada com sucesso");
				}
				else {
					System.out.println("Não foi possível adicionar a obra: título ou autor já existente.");
				}
				break;
				
			case 2:
								
				System.out.println("Catálogo das obras atuais");
				g.imprimirDetalhes();
				break;
				
			case 3:
				
				input.nextLine(); //limpar o buffer
				
				System.out.println("Título da obra: ");
				String titulo1 = input.nextLine();
				
				Obra encontrada = g.pesquisarTitulo(titulo1);
				if(encontrada!=null) {
					System.out.println(encontrada);
						
					}
				else {
					System.out.println("Não foi encontrada nenhuma obra com esse nome");
				}
				break;
				
			case 4:
				
				input.nextLine(); //limpar o buffer
				
				System.out.println("Tipo de tela: ");
				String tipoTela = input.nextLine();
				g.imprimirTela(tipoTela);
				break;
				
			case 5:
				
				g.imprimirObras();
				break;
				
			case 0:
				
				System.out.println("A sair...");
				break;
				
			default:
				
				System.out.println("Opção inválida");
				
				
			
		}
			
			
		
	
		}while (opção!=0);			
	

	}

}
