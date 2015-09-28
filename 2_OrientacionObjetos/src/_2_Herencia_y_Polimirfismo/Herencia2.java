package _2_Herencia_y_Polimirfismo;

import _0_ObjetosParaEjemplos.Coche;
import _0_ObjetosParaEjemplos.Vehiculo;

public class Herencia2 {

	public static void main(String... args){
		//El metodo en tiempo de ejecucion depende del tipo de objeto
		//Tipo de referencia = tipo de objeto
		Coche coche = new Coche();
		coche.arranca();  	//Se ejecuta el metodo de coche
		coche.pita();
		
		Vehiculo v = new Vehiculo();
		v.arranca();		//Se ejecuta el metodo de vehiculo
		
		Vehiculo vc = new Coche(); 		//Similar a List = new ArrayList()
		vc.arranca();		//Se ejecuta el metodo de coche
	}
}



/*
 *	La herencia permite:
 *	reutilizar código
 *	uso del polimorfismo
 */