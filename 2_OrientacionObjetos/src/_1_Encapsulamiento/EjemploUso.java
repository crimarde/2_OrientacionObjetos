package _1_Encapsulamiento;

public class EjemploUso {

	public static void main(String[] args) {
		Ejemplo ej = new Ejemplo();
		ej.setNombre("Chris"); //Modificación de una variable de instancia a través de setters
		
		System.out.println("El nombre es: " + ej.getNombre()); //Lectura de variable de instancia a través de getter
	}

}
