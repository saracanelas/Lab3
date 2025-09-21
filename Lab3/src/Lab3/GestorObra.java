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
	 
	
	  public Obra pesquisarTitulo (String titulo) { 
		  for (Obra o : obras) {
			  if (o.getTitulo().equalsIgnoreCase(titulo)) {
				  return o; 
				  }
			  }
		  return null; 
	  }
	 
	  public Obra pesquisarAutor (String autor) {
		  for (Obra o : obras)
			  if (o.getAutor().equalsIgnoreCase(autor)) {
				  return o;
			  }
		  return null;
	  }
	  
	  public void imprimirDetalhes() {
		  for (Obra o : obras)
			  System.out.println(o);
	  }
	  
		
		  public void imprimirTela (String tipoTela) {
			  
		  boolean encontrado = false;
			  
		  for (Obra o : obras) { 
			  
			  if (o instanceof PinturaOleo) { 
				PinturaOleo p = (PinturaOleo) o; //conversão  
				  if (o.getTipoTela().equalsIgnoreCase(TipoTela)) { 
					  System.out.println("Título: " + o.getTitulo() + "/nAutor: " + o.getAutor()); } } 
			  
			  if (o !instanceof PinturaOleo) {
		  System.out.println("não foi encontrada nenhuma Pintura do tipo: " +  tipoTela); 
			  	} 
			  } 
		  }
		 
	  
}
