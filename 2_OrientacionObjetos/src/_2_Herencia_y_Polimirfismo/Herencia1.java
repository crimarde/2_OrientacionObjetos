package _2_Herencia_y_Polimirfismo;

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

class Vehiculo{
	public void arranca(){
		System.out.println("Vehiculo arrancado");
	}
}

class Coche extends Vehiculo {
	public void pita(){
		System.out.println("El coche pita");
	}
}

/*
 *	La herencia permite:
 *	reutilizar c�digo
 *	uso del polimorfismo
 */