package ar.edu.unju.fi.ejercicio6.Main;

import java.util.*;
import ar.edu.unju.fi.ejercicio6.Model.Persona;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Persona persona = new Persona();
		int edad;
		
		System.out.println("ingrese dni");
		persona.setDni(scan.nextInt());
		System.out.println("ingrese nombre");
		persona.setNombre(scan.next());
		System.out.println("ingrese fecha de nacimiento");
		System.out.println("ingrese anio");
		int anio = scan.nextInt();
		System.out.println("ingrese mes");
		int mes = scan.nextInt();
		System.out.println("ingrese dia");
		int dia = scan.nextInt();
		persona.setFecha(anio, mes, dia);
		edad = persona.calcular_edad(persona.getFecha());
		System.out.println("ingrese provincia");
		persona.setProvincia(scan.next());
		persona.getdatos(edad);
		
		
		System.out.println("\ningrese los datos de la segunda persona");
		System.out.println("ingrese dni");
		int DNI2 = (scan.nextInt());
		System.out.println("ingrese nombre");
		String nombre2 = (scan.next());
		System.out.println("ingrese fecha de nacimiento");
		System.out.println("ingrese anio");
		int anio2 = scan.nextInt();
		System.out.println("ingrese mes");
		int mes2 = scan.nextInt();
		System.out.println("ingrese dia");
		int dia2 = scan.nextInt();
		LocalDate fecha_nac2 = LocalDate.of(anio2, mes2, dia2);
		System.out.println("ingrese provincia");
		String provincia2 = (scan.next());
		
		Persona persona2 = new Persona(DNI2,nombre2,fecha_nac2,provincia2);
		
		int edad2 = persona.calcular_edad(persona2.getFecha());
		persona2.getdatos(edad2);
		
		
		System.out.println("\ningrese los datos de la tercera persona");
		System.out.println("ingrese dni");
		int DNI3 = (scan.nextInt());
		System.out.println("ingrese nombre");
		String nombre3 = (scan.next());
		System.out.println("ingrese fecha de nacimiento");
		System.out.println("ingrese anio");
		int anio3 = scan.nextInt();
		System.out.println("ingrese mes");
		int mes3 = scan.nextInt();
		System.out.println("ingrese dia");
		int dia3 = scan.nextInt();
		LocalDate fecha_nac3 = LocalDate.of(anio3, mes3, dia3);
		
		Persona persona3 = new Persona(DNI3, nombre3, fecha_nac3);
		int edad3 = persona.calcular_edad(persona3.getFecha());
		persona3.getdatos(edad3);
		
		
		
		
		
		
		
	}

}
