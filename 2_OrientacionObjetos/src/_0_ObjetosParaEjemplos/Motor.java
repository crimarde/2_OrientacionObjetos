package _0_ObjetosParaEjemplos;

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