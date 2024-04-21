package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	
	String nombre;
	String apellido;
	LocalDate fecha_nac;
	String nacionalidad;
	double estatura;
	double peso;
	String posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	public int calcular_edad(LocalDate fecha) {
		LocalDate fecha_actual= LocalDate.now();
		int edad = Period.between(fecha, fecha_actual).getYears();
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		return "Jugador{" + "nombre= " + nombre + ", apellido= " + apellido + ", fecha de nacimiento= " + fecha_nac + ", nacionalidad= " + nacionalidad + ", estatura= " + estatura + ", peso= " + peso + ", posicion= "+ posicion + "}"; 
	}

}
