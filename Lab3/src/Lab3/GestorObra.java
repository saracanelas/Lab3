/**
 * 
 */
package Lab3;

import java.util.ArrayList;

/**
 * 
 */
public class GestorObra {
	 private ArrayList <Obra>obras; 
	
	
	 //método para adicionar obras, confirmando se já existem 
	 public void adicionarObra(Obra obra) { 
		  if (pesquisarTitulo(obra.getTitulo()) !=null) {
			  return;
		  }
		  
		  if (pesquisarAutor(obra.getAutor()) !=null) {
			  return;
		  }
		  
		  else {
			  obras.add(obra);
		  }
	  }
	 
	
	 //Pesquisar obras por título 
	 public Obra pesquisarTitulo (String titulo) { 
		  for (Obra o : obras) {
			  if (o.getTitulo().equalsIgnoreCase(titulo)) {
				  return o; 
				  }
			  }
		  return null; 
	  }
	 
	 //Pesquisar obras por autor 
	 public Obra pesquisarAutor (String autor) {
		  for (Obra o : obras)
			  if (o.getAutor().equalsIgnoreCase(autor)) {
				  return o;
			  }
		  return null;
	  }
	  
	 //imprimir todos os detalhes de todas as obras
	  public void imprimirDetalhes() {
		  for (Obra o : obras)
			  System.out.println(o);
	  }
	  
		//imprimir pinturas a óleo consoante o tipo de tela
	  public void imprimirTela (String tipoTela) {
			  
		  boolean encontrado = false;
			  
		  for (Obra o : obras) { 
			  if (o instanceof PinturaOleo) { 
				PinturaOleo p = (PinturaOleo) o; //conversão do objeto para aceder a métodos específicos da subclasse
				  if (p.getTipoTela().equalsIgnoreCase(tipoTela)) { 
					  System.out.println("Título: " + p.getTitulo() + "\nAutor: " + p.getAutor()); 
					  encontrado = true;
				  	} 
				  } 
		  		}
			  
			  if (!encontrado) {
		  System.out.println("Não foi encontrada nenhuma Pintura do tipo: " +  tipoTela); 
			  	} 
			   
		  }
		
	  //imprimir detalhes de todas as obras agrupadas por tipo
	  public void imprimirObras() {
			  
			  int totalPintura = 0;
			  int totalEscultura = 0;
			  int totalPinturaOleo = 0;
			  
			  for (Obra o : obras) {
				  if (o instanceof Pintura) {
					  System.out.println(o);
					  totalPintura++;
				  }
				  
				  if (o instanceof Escultura) {
					  if (o instanceof Escultura) {
						  System.out.println(o);
						  totalEscultura++;
					  }
				  }
				  
				  if (o instanceof PinturaOleo) {
					  System.out.println(o);
					  totalPinturaOleo++;
				  }
			  
			  }
		 
	  
		  }
	
}
