package ar.edu.unju.fi.ejercicio7.main;

import java.util.*;
import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = scan.nextLine();
		System.out.println("Ingrese legajo: ");
		int legajo = scan.nextInt();
		System.out.println("Ingrese salario");
		double salario = scan.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostrar(empleado);
		empleado.aumento(empleado);
		System.out.println("\nempleado con aumento");
		empleado.mostrar(empleado);

	}

}
