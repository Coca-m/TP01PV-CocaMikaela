package ar.edu.unju.fi.ejercicio8.model;

import java.math.*;

public class CalculadoraEspecial {
	
	private int n;

	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria(int n) {
		
		double resultado=0;
		
		for(int i = 1; i<=n;i++) {
			
		resultado = resultado + Math.pow(((i*(i+1))/2),2.0);	
		}
	return resultado;
		
	}
	
	public double calcularProductoria(int n) {
		
		double resultado=1;
		for (int i = 1; i<=n; i++) {
			resultado = resultado*(i*(i+4));
		}
	return resultado;
		
	}
	
}
