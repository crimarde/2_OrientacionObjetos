package _2_Herencia_y_Polimirfismo;

import _0_ObjetosParaEjemplos.Coche;
import _0_ObjetosParaEjemplos.Vehiculo;

public class Herencia1 {

	public static void main(String... args){
		Coche coche = new Coche();
		coche.arranca();  	//Metodo heredado de Vehiculo
		coche.pita();		//Metodo propio de coche
		
		//Pasar un vehiculo a una clase
		Vehiculo v = new Vehiculo();
		Coche c = new Coche();
		pinta(v);
		pinta(c); //Puedo pasar un coche porque hereda de vehiculo (es un vehiculo)
		//Solo se puede llamar a los metodos de vehiculo y no a ningun metodo de las subclases
	}
	
	public static void pinta(Vehiculo v){  //Acepta Vehiculo o cualquier subtipo
		v.arranca();
	}
}


/*
 *	La herencia permite:
 *	reutilizar código
 *	uso del polimorfismo
 */