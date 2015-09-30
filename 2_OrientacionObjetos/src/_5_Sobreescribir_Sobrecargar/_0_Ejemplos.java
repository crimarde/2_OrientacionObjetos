package _5_Sobreescribir_Sobrecargar;

import _0_ObjetosParaEjemplos.Animal;
import _0_ObjetosParaEjemplos.Caballo;

public class _0_Ejemplos {

	public static void main(String[] args) {
		//Animal a = new Animal(); No se puede instanciar una clase abstracta
		Caballo c = new Caballo();
		Animal ac = new Caballo();
		
		//a.come(); 	// llamada al metodo generico
		c.come();	// llamada al metido de animal 
		ac.come();	// llamda al metodo generico (sobreescrito) por caballo

		c.anda();	// llamada al metodo de caballo
		ac.anda();	// llamda al metodo generico (sobreescrito) por caballo
		c.relincha();
		// ac no puede llamar a relincha, ya que el tipo de la referencia (Animal)
		// no tiene el metodo relincha
		
		/* Reglas de sobreescritura
		 * 
		 * 1.- La lista de argumentos debe coincidir con la lista de argumetos del metodo sobresscritos
		 * 2.- El tipo de retorno debe ser el mismo o un subtipo
		 * 3.- El modificador de acceso no puede ser mas restrictivo que el del metos sobreescrito
		 * 4.- El modificador de acceso puede ser menos restrictivo que el del meto bobreeescrito
		 * 5.- El metodo sobreescrito puede lanzar excepciones "checked"
		 * 6.- El metodo sobreescrito NO puede lanzar nuevas excepciones "checked"
		 * 7.- El metodo sobreescrito SI puede lanzar nuevas excepciones
		 * 8.- No se puede sobreescribir una un metodo final o estático
		 * 9.- Si un metodo no se puede heredar, no se puede sobreescribir 
		 */
	}

}
