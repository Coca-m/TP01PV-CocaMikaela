package ar.edu.unju.fi.ejercicio13;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arreglo = new int[8];
		
		for (int i = 0; i<arreglo.length;i++) {
			
			System.out.println("ingrese un numero entero");
			arreglo[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i<arreglo.length;i++) {
			
			System.out.println("Valor almacenado en la posicion "+i+": "+ arreglo[i]);
			
		}
		

	}

}
