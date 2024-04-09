package ar.edu.unju.fi.ejercicio3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		int num = scanner.nextInt();
		if (num%2 == 0) {
			num = num*3;
			System.out.println("el numero es par: "+ num);
		}
		else {
			num = num*2;
		    System.out.println("el numero es impar: "+ num);
		}
		
	
	}

}
