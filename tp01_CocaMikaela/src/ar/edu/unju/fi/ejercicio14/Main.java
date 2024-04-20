package ar.edu.unju.fi.ejercicio14;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cap;
		
		do {
		System.out.println("ingrese un numero entero entre el 3 y 10");
		cap = sc.nextInt();
		}
		while(cap<3 || cap>10);
		
		int[] arreglo = new int[cap];
		
        for (int i = 0; i<arreglo.length;i++) {
			
			System.out.println("ingrese un numero entero");
			arreglo[i] = sc.nextInt();	
		}
        
        int suma=0;
	    for (int i = 0; i<arreglo.length;i++) {
			
			System.out.println("Valor almacenado en la posicion "+i+": "+ arreglo[i]);
			suma= suma + arreglo[i];
		}
		
	    System.out.println("La suma de todos los valores del arreglo es: "+ suma);
		
		

	}

}
