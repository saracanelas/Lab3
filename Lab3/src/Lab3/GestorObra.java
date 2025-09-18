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
	
	
	  public void adicionarObra(Obra o) { 
		  obras.add(o); 
		  }
	 
	
	
	  public Obra pesquisarTitulo (String titulo) { 
		  for (Obra o : obras) 
			  if (o.getTitulo().equalsIgnoreCase(titulo)) {
				  return o; 
				  }
	  System.out.println("Obra não encontrada"); 
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
	  
		/*
		 * public void imprimirTela (String tipoTela) {
		 * 
		 * for (Obra o : obras) { if (o instanceof PinturaOleo) { if
		 * (o.getTipoTela().equalsIgnoreCase(TipoTela)) { System.out.println("Título: "
		 * + o.getTitulo() + "/nAutor: " + o.getAutor()); } } if (o !instanceof
		 * PinturaOleo) {
		 * System.out.println("não foi encontrada nenhuma Pintura do tipo: " +
		 * tipoTela); } } }
		 */
	  
}
