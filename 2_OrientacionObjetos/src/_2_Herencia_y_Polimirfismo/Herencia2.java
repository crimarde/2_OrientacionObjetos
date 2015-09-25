package _2_Herencia_y_Polimirfismo;

public class Herencia2 {

	public static void main(String... args){
		//El metodo en tiempo de ejecucion depende del tipo de objeto
		//Tipo de referencia = tipo de objeto
		Coche2 coche = new Coche2();
		coche.arranca();  	//Se ejecuta el metodo de coche
		coche.pita();
		
		Vehiculo2 v = new Vehiculo2();
		v.arranca();		//Se ejecuta el metodo de vehiculo
		
		Vehiculo2 vc = new Coche2(); 		//Similar a List = new ArrayList()
		vc.arranca();		//Se ejecuta el metodo de coche
	}
}

class Vehiculo2{
	//Metodo generico que funciona igual en todas las clases
	public void identificacion(){
		System.out.println("Mi numero de series es 1");
	}
	
	public void arranca(){
		System.out.println("Vehiculo arrancado");
	}
}

class Coche2 extends Vehiculo2 {
	// Metodo que especializa la funcionalidad de una clase hija
	public void pita(){
		System.out.println("El coche pita");
	}
	
	public void arranca(){
		System.out.println("Coche arrancado");
	}
}

/*
 *	La herencia permite:
 *	reutilizar código
 *	uso del polimorfismo
 */