package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar fecha_nac = Calendar.getInstance();
		Persona persona = new Persona();
		
		System.out.println("ingrese el nombre de la persona: ");
		persona.setNombre(sc.nextLine());
		System.out.println("Ingrese la fecha de nacimiento de la persona");
		System.out.println("\ningrese el Año de nacimiento:");
		int anio = sc.nextInt();
		System.out.println("ingrese el mes de nacimiento");
		int mes = sc.nextInt();
		System.out.println("ingrese el dia de nacimiento");
		int dia = sc.nextInt();
		fecha_nac.set(anio, mes-1, dia);
		persona.setFecha_nac(fecha_nac);
		
		System.out.println("Nombre: " + persona.getNombre());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("fecha nacimiento: "+ sdf.format(persona.getFecha_nac().getTime()));
		long edad = persona.calcularedad(persona.getFecha_nac());
		System.out.println("edad: "+ edad);
		persona.zodiaco(persona.getFecha_nac());
		persona.estaciones(persona.getFecha_nac());
		
		
		
		
		
		
		
		

	}

}
