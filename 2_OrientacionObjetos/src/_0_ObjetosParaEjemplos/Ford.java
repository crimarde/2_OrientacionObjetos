package _0_ObjetosParaEjemplos;

public class Ford extends Coche{
	private Motor motor;
	
	public Ford() {
		super();
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
