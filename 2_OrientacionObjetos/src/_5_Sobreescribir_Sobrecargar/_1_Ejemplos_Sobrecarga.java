package _5_Sobreescribir_Sobrecargar;

import _0_ObjetosParaEjemplos.Animal;
import _0_ObjetosParaEjemplos.Caballo;

public class _1_Ejemplos_Sobrecarga {

	// Un metodo sobrecargaso es un metodo con el mismo nombre y diferente lista de argumentos
	// y opcionalmente diferente tipo de retorno
	public static void main(String... args){
		Caballo c  = new Caballo();
		c.come();
		c.come("zanahoria");
		c.come("zanahoria", 3);
		
		// EL TIPO DE REFERENCIA DETERMINA QUE METODO SOBRECARGADO SE INVOCA
		Animal a = new Caballo();
		a.come();
		// No tiene lo sobrecargados porque están en caballo y no en animal
	}
}

/**
* Los metodos sobreescritos DEBEN cambiar la lista de argumentos
* PUEDEN cambiar el tipo de retorno
* PUEDEN cambiar el modificador de acceso
* PUEDEN declarar o lanzar nuevas excepciones checked
* Se puede sobreescribir en la misma clase o en una subclase
*/
