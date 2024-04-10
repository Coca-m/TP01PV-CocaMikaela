package ar.edu.unju.fi.ejercicio5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero del 1 al 9");
		int num = scan.nextInt();
		if (num>0 && num<10) {
			for(int i=0; i<=10; i++) {
				System.out.println(num + "X" + i + "=" + num*i);
			}
		}
		else
			 System.out.println("el numero no cumple con el rango especificado");

	}

}
