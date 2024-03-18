package pruebaMain;

public class calculadora {
	
	private int suma;
	private int resta;
	private int division;
	private int multiplicacion;
	


	public int getSuma() {
		System.out.println("Soy el Mejor.jloilkuykioukyhuky..");
		return suma;
	}


	public void setSuma(int suma) {
		this.suma = suma;
	}


	public int getResta() {
		return resta;
	}


	public void setResta(int resta) {
		this.resta = resta;
	}


	public int getDivision() {
		return division;
	}


	public void setDivision(int division) {
		this.division = division;
	}


	public int getMultiplicacion() {
		return multiplicacion;
	}


	public void setMultiplicacion(int multiplicacion) {
		this.multiplicacion = multiplicacion;
	}
	
	
	
	
	public void sumar(int numero1, int numero2){
		
		suma = numero1 + numero2;
	}
	
	public void restar(int numero1, int numero2){
		
		resta = numero1 - numero2;
		
	}
	
	public void multiplicar(int numero1, int numero2) {
		
		multiplicacion = numero1 * numero2;
		
	}
	
	public void dividir(int numero1, int numero2) {
		
		division = numero1 / numero2;
		
	}
	

	public void resultado() {
		System.out.println("la suma es :"+suma);
		System.out.println("la resta es :"+resta);
		System.out.println("la multiplicacion es :"+multiplicacion);
		System.out.println("la division es :"+division);
		
	}
}
