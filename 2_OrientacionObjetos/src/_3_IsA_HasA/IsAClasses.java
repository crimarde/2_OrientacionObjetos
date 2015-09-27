package _3_IsA_HasA;

public class IsAClasses {
	
	public static void main(String... args){
		Vehiculo v = new Vehiculo();
		Vehiculo vc = new Coche();
		Vehiculo vf = new Ford();
		
		Coche c = new Coche();
		Coche cf = new Ford();
		
		Ford f = new Ford();
		
		System.out.println("Todos heredan de vehiculo o una subclase, por tanto todos \"IsA\" vehiculo:");
		System.out.println("v isA Vehiculo -> " + String.valueOf(v instanceof Vehiculo));
		System.out.println("vc isA Vehiculo -> " + String.valueOf(vc instanceof Vehiculo));
		System.out.println("vf isA Vehiculo -> " + String.valueOf(vf instanceof Vehiculo));
		System.out.println("c isA Vehiculo -> " + String.valueOf(c instanceof Vehiculo));
		System.out.println("cf isA Vehiculo -> " + String.valueOf(cf instanceof Vehiculo));
		System.out.println("f isA Vehiculo -> " + String.valueOf(f instanceof Vehiculo));
		
		System.out.println("\nLos que no son:");
		System.out.println("c isA Ford -> " + String.valueOf(c instanceof Ford));
		System.out.println("c isA Coche -> " + String.valueOf(v instanceof Coche));
		
		// Metodos que se llama
		System.out.println("El metodo al que se llama depende del tipo de objeto (Instance type = new object type)");
		v.identificame();
		vc.identificame();
		vf.identificame();
		c.identificame();
		cf.identificame();
		f.identificame();
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
	public void identificame(){
		System.out.println("Soy un Ford");
	}
}
