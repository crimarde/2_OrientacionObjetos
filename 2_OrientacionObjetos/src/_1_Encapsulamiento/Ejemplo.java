package _1_Encapsulamiento;

public class Ejemplo {
	
	// Las variables de instancia son privadas
	private String nombre;
	private String apellido;
	private int edad;
	
	public Ejemplo() {
		super(); //LLamada al constructor del objeto padre
	}

	public Ejemplo(String nombre, String apellido, int edad) {
		this(); //Llamada al constructor por defecto
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//Encapsulamiento, getters y setters publicos (permiten el aceso a las variables de instancia)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}

/*
 * El acceso a las variables se hace a través de los getters y setters en lugar de 
 * acceder directamente a las variables.
 * 
 * Si en algún momento hay que cambiar la implementavión, todas aquellas clases que 
 * usen esta no se van a enterar del cambio, se conocen los métodos pero no la 
 * implementación.
 */