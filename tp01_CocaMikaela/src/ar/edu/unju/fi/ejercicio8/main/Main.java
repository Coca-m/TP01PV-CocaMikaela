package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		System.out.println("ingrese un numero entero");
		calculadora.setN(scan.nextInt());
		double sumatoria = calculadora.calcularSumatoria(calculadora.getN());
		double productoria = calculadora.calcularProductoria(calculadora.getN());
	    System.out.println("El resultado de la sumatoria para "+ calculadora.getN()+ " es: "+ sumatoria);
	    System.out.println("El resultado de la productoria para "+ calculadora.getN()+ " es: "+ productoria);
	}

}
