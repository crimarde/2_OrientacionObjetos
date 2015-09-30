package _4_Polomorfismo;

import _0_ObjetosParaEjemplos.Coche;
import _0_ObjetosParaEjemplos.Ford;
import _0_ObjetosParaEjemplos.Vehiculo;

public class _0_Definiciones {

	public static void main(String[] args) {
			
		// Vehiculo es la clase de referencia (Tipo de referencia)
		// Coche es el tipo del objeto creado.
		Vehiculo v = new Coche();
		
		
		//Una vez creada una variable, esta no puede cambiar de tipo, aunque si puede modificar la 
		//referencia hacia la variable que apunta:
		Coche c2 = new Coche();
		v = c2;  //V nocambia sigue siendo un vehúclo, pero ahora apunta a c2 y no a c
		
		//La variable de referencia determina los métodos a los que el objeto puede llamar
		//En el caso del ejemplo sólo se puede llamar alos metodos de vehiculo, aunque la variable apunte
		//a un objeto de tipo Coche, (que hereda de vehiculo, por lo que isA vehiculo) no se puede llamar
		//a los metodos propios de coche (salvo que sobreescriban a algún metodo)
		
		//v puede apuntar a un vehículo o a cualquier subtipo
		v = new Coche();
		v = new Ford();
		v = new Vehiculo();
	}

}
