package ar.edu.unju.fi.ejercicio15;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
		int cap;
		do {
		System.out.println("ingrese un numero entero entre el 5 y 10");
		cap = sc.nextInt();
		}
		while(cap<5 || cap>10);
		
		String[] arreglo = new 	String[cap];
		
		 for (int i = 0; i<arreglo.length;i++) {
				
				System.out.println("ingrese el nombre de una persona");
				arreglo[i] = sc.next();
			}
		 
		 System.out.println("\nRECORRIDO NORMAL");
		 for (int i = 0; i<arreglo.length;i++) {
				
				System.out.println("Valor almacenado en la posicion "+i+": "+ arreglo[i]);
				
			}
		 
		 
		 System.out.println("\nRECORRIDO INVERSO");
		 for (int i = cap-1; i>=0;i--) {
				
				System.out.println("Valor almacenado en la posicion "+i+": "+ arreglo[i]);
				
			}
		

	}

}
