package ar.edu.unju.fi.ejercicio6.Model;

import java.time.LocalDate;
import java.time.Period;


public class Persona {
	
	private int dni;
	private String nombre;
	private LocalDate fecha;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int dni, String nombre, LocalDate fecha, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia = provincia;
	}
	
	public Persona(int dni, String nombre, LocalDate fecha) {
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia = "Jujuy";
	}
	
	//public int calcular_edad(LocalDate fecha) {
		//LocalDate fecha_actual= LocalDate.now();
		//int anio_nac = fecha.getYear();
		//int anio_actual = fecha_actual.getYear();
		//int edad = anio_actual - anio_nac;
		//return edad;
	//}
	
	public int calcular_edad(LocalDate fecha) {
		LocalDate fecha_actual= LocalDate.now();
		int edad = Period.between(fecha, fecha_actual).getYears();
		return edad;
	}
	
	public Boolean mayor_menor(int edad) {
		
		if (edad<18)
			return false;
		else 
			return true;
	}
	
	public void getdatos(int edad) {
		
		if (mayor_menor(edad)==true) {
			System.out.println("\nDNI: " + this.dni);
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Fecha de nacimiento: " + this.fecha);
			System.out.println("Edad: " + edad + "(es mayor de edad)");
			System.out.println("Provincia: " + this.provincia);
		}
		else {
			System.out.println("\nDNI: " + this.dni);
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Fecha de nacimiento: " + this.fecha);
			System.out.println("Edad: " + edad + "(es menor de edad)");
			System.out.println("Provincia: " + this.provincia);
		}
		
			
		}
	
	

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(int anio, int mes,int dia) {
		this.fecha = LocalDate.of(anio, mes, dia);
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
	
 
}
