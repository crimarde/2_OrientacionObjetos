package _1_Encapsulamiento;

public class EjemploUso {

	public static void main(String[] args) {
		Ejemplo ej = new Ejemplo();
		ej.setNombre("Chris"); //Modificaci�n de una variable de instancia a trav�s de setters
		
		System.out.println("El nombre es: " + ej.getNombre()); //Lectura de variable de instancia a trav�s de getter
	}

}
