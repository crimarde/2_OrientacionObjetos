package _5_Sobreescribir_Sobrecargar;

import _0_ObjetosParaEjemplos.Animal;
import _0_ObjetosParaEjemplos.Caballo;

public class _2_Polimorfismo_sobrecarga_sobreescritura {

	public static void main (String ... args){
		Animal a = new Caballo();
		Caballo c = new Caballo();
		
		//Para llamar a metodos sobrecargados se tiene en cuenta el tipo de referencia
		a.come(); //Apunta a animal, aunque esta sobreescrito y se pinta el de caballo
		c.come();
		c.come("alfalfa");
		c.come("alfalfa", 2);
		
		//Para metodos sobreescritos se tiene en cuenta el tipo de objeto
		c.come(); //llama a anda de caballo y no de animal
	}
}
