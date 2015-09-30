package _0_ObjetosParaEjemplos;

public class Caballo extends Animal {
	
	public Caballo() {
		super();
	}
	
	public void come(){
		System.out.println("Caballo comiendo");
	}

	public void come(String comida){
		System.out.println("Caballo comiendo " + comida);
	}
	
	public void come(String comida, int cantidad){
		System.out.println("Caballo comiendo " + cantidad + " uds de " + comida);
	}
	
	@Override
	public void anda() {
		// Metodo sobreescrito forzosamente, ya que animal es abstracto,
		//la primera clase no abstracta del rbol de herencia debe forzosamente 
		//implemetar los metodos abstractos de las clases padre.
		// El objetivo de un metodo abstracto es forzar a la clase que hereda
		// a implemetar los metods (esècializacion)
		System.out.println("El caballo anda");
	}
	
	public void relincha(){
		System.out.println("hiiiiiiii");
	}
	
	public void llamadaMetodoClasePadre(){
		super.come();
	}

}
