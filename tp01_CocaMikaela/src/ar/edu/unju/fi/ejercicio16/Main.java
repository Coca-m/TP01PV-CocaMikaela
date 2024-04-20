package ar.edu.unju.fi.ejercicio16;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arreglo = new String[5];
		
		 for (int i = 0; i<arreglo.length;i++) {
				
			System.out.println("ingrese el nombre de una persona");
			arreglo[i] = sc.next();
			
		 }
		 int op = arreglo.length-1;
		 
		 int i = 0;
		 while ( i < arreglo.length) {
			 
			 System.out.println("valor almacenado en la posicion "+ i + ": "+ arreglo[i]);
			 i++;
			 
		 }
		 
		 System.out.println("\nEl tamano del arreglo es de "+ arreglo.length + " posiciones");
		 
		 byte pos;
		 do {
		 System.out.println("Ingrese la posicion que desee eliminar");
		 pos = sc.nextByte();
		 }
		 while(pos<0 || pos>=arreglo.length);
		 
		 int j = pos;
		 if(pos == op) {
			 op--;
		 }
		 else {
		 while (j < op) {
			 
			 arreglo[j]= arreglo[j+1];
			 j++;
		 }
		 op--;
		 }
		 
		 System.out.println("\nARREGLO CON UN ELEMENTO ELIMINADO:");
		 i = 0;
		 while ( i <= op) {
			 
			 System.out.println("valor almacenado en la posicion "+ i + ": "+ arreglo[i]);
			 i++;
			 
		 }
		 
		 
		
		 
		 

	}

}
