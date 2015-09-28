package _3_IsA_HasA;

public class HasAClasses {
	
	public static void main(String... args){
	
		Ford f = new Ford();
		
		f.arranca();
		f.acelera();
		f.frena();
		f.para();
	}
}

class Vehiculo{
	public void identificame(){
		System.out.println("Soy un vehiculo");
	}
}

class Coche extends Vehiculo{
	public void identificame(){
		System.out.println("Soy un coche");
	}
}

class Ford extends Coche{
	private Motor motor;
	public Ford() {
		this.motor = new Motor();
	}
	//Metodos delegados
	public void arranca() {
		motor.arranca();
	}
	public void acelera() {
		motor.acelera();
	}
	public void frena() {
		motor.frena();
	}
	public void para() {
		motor.para();
	}

	public void identificame(){
		System.out.println("Soy un Ford");
	}
}

class Motor{
	
	private int velocidad = 0;
	public Motor() {
		super();
	}
	public void arranca(){
		velocidad = 0;
		System.out.println("Coche arrancado");
	}
	public void acelera(){
		velocidad +=1;
		System.out.println("Acelera, la velocidad es de ".concat(String.valueOf(velocidad)));
	}
	public void frena(){
		if(velocidad > 0){
			velocidad -=1;
		}
		System.out.println("Frena, la velocidad es de ".concat(String.valueOf(velocidad)));
	}
	public void para(){
		velocidad = 0;
		System.out.println("Coche parado");
	}
	
}
