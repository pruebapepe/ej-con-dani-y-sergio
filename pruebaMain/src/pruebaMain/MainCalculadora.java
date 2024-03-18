package pruebaMain;

import java.util.Scanner;


public class MainCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		// comentario ricaaaaaardo como Prueba de suvida
		System.out.println("ingresa el primer numero");
		int n1 = sn.nextInt();
		
		System.out.println("ingresa el segundo numero");
		int n2 = sn.nextInt();
		
		calculadora calc = new calculadora();
		
		calc.sumar(n1,n2);
		calc.restar(n1,n2);
		calc.multiplicar(n1,n2);
		calc.dividir(n1,n2);
		
		calc.resultado();
		System.out.println("Soy SergioSergio");
		
	}

}
