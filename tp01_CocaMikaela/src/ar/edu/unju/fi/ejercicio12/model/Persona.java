package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.time.*;

public class Persona {

	private String nombre;
	private Calendar fecha_nac;
	
	Calendar hoy = Calendar.getInstance();
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public long calcularedad(Calendar fecha_nac) {
		hoy.getTime();
		long milisegundos = hoy.getTimeInMillis() - fecha_nac.getTimeInMillis();
		long edad = milisegundos/1000/60/60/24/365;
		return edad;
		
	}
	
	public void zodiaco(Calendar fecha_nac) {
		
		int mes = fecha_nac.get(Calendar.MONTH);
		int dia = fecha_nac.get(Calendar.DAY_OF_MONTH);
		
		if((mes==2 && dia>=21) || (mes==3 && dia<=19))
		System.out.println("Signo del zodiaco: Aries");
		
		if((mes==3 && dia>=20) || (mes==4 && dia<=20))
			System.out.println("Signo del zodiaco: Tauro");
		
		if((mes==4 && dia>=21) || (mes==5 && dia<=20))
			System.out.println("Signo del zodiaco: Geminis");
		
		if((mes==5 && dia>=21) || (mes==6 && dia<=22))
			System.out.println("Signo del zodiaco: Cancer");
		
		if((mes==6 && dia>=23) || (mes==7 && dia<=22))
			System.out.println("Signo del zodiaco: Leo");
		
		if((mes==7 && dia>=23) || (mes==8 && dia<=22))
			System.out.println("Signo del zodiaco: Virgo");
		
		if((mes==8 && dia>=23) || (mes==9 && dia<=22))
			System.out.println("Signo del zodiaco: Libra");
		
		if((mes==9 && dia>=23) || (mes==10 && dia<=21))
			System.out.println("Signo del zodiaco: Escorpio");
		
		if((mes==10 && dia>=22) || (mes==11 && dia<=21))
			System.out.println("Signo del zodiaco: Sagitario");
		
		if((mes==11 && dia>=22) || (mes==0 && dia<=19))
			System.out.println("Signo del zodiaco: Capricornio");
		
		if((mes==0 && dia>=20) || (mes==1 && dia<=18))
			System.out.println("Signo del zodiaco: Acuario");
		
		if((mes==1 && dia>=19) || (mes==2 && dia<=20))
			System.out.println("Signo del zodiaco: Piscis");
		}
		
	public void estaciones(Calendar fecha_nac) {
		
		switch(fecha_nac.get(Calendar.MONTH)) 
		{ 
		case 11,0,1: 
			System.out.println("Estacion: Verano");
		break;
		
		case 2,3,4:
			System.out.println("Estacion: Otono");
		break;
		
		case 5,6,7:
			System.out.println("Estacion: Invierno");
		break;
		
		case 8,9,10:
			System.out.println("Estacion: Primavera");
		break;
		
		default:
			System.out.println("Error");
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Calendar fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	
	
	
}
