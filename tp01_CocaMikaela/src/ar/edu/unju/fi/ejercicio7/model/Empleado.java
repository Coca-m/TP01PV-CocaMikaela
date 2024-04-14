package ar.edu.unju.fi.ejercicio7.model;


public class Empleado {
	
	private String nombre;
	private int legajo;
	private double salario;
	
	final double SALARIO_MIN = 210000.00;
	final double AUMENTO = 20000.00;
	
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= SALARIO_MIN) {
		this.salario = salario;}
		else {
			System.out.println("el salario ingresado no cumple con el minimo establecido \nse procedera a establecer el minimo");
			salario = SALARIO_MIN;
			this.salario = salario;}
	}
	
	public void mostrar(Empleado empleado) {
		
		System.out.println("Nombre del empleado: " + empleado.nombre);
		System.out.println("Legajo: " + empleado.legajo);
		System.out.println("Salario $: " + empleado.salario);
	}
	
	public void aumento(Empleado empleado){
		
		empleado.salario = AUMENTO + empleado.salario;
		
	}
	
}
