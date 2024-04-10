package ar.edu.unju.fi.ejercicio4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int factorial=1;
		int repeticiones=1;
		
		System.out.println("Ingrese un numero entero del 0 al 10");
		int num = scan.nextInt();
		 if (num>=0 && num<=10) {
			if (num==0) {
			factorial = 1;
			}
			else
			{
				while(repeticiones<=num){
					factorial = factorial*repeticiones;
					repeticiones++;
				}
                   				
			}
		System.out.println("el factorial del numero ingresado es: "+ factorial);
		 }
		 else
			 System.out.println("el numero no cumple con el rango especificado");
		
		
	
	}

}
