package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		List<Jugador> lista = new ArrayList<>();
		
		do {
		System.out.println("Elija que es lo que quiere hacer");
		System.out.println("1-Alta de jugador");
		System.out.println("2-Mostrar los datos del jugador");
		System.out.println("3-Mostrar todos los jugadores");
		System.out.println("4-Modificar los datos de un jugador");
		System.out.println("5-Eliminar un jugador");
		System.out.println("6-Mostrar cantidad de jugadores registrados");
		System.out.println("7-Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		System.out.println("8-Salir");
		op = sc.nextInt();
		
		switch(op) 
		{ 
		case 1:
			Jugador jugador = new Jugador();
			System.out.println("ingrese el nombre del jugador:");
			jugador.setNombre(sc.next());
			System.out.println("ingrese el apellido del jugador:");
			jugador.setApellido(sc.next());
			try {
			System.out.println("ingrese fecha de nacimiento (dd/MM/yyyy):");
			String fecha_nac = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fecha_nacimiento = LocalDate.parse(fecha_nac, formatter);
			jugador.setFecha_nac(fecha_nacimiento);
			}
			catch (Exception e) {
				System.out.println("El formato de la fecha debe de ser dd/mm/yyyy de otra forma se estara cometiendo un error");
			}
			System.out.println("ingrese la nacionalidad del jugador:");
			jugador.setNacionalidad(sc.next());
			try {
			System.out.println("ingrese la estatura del jugador");
			jugador.setEstatura(sc.nextDouble());
			System.out.println("ingrese el peso del jugador");
			jugador.setPeso(sc.nextDouble());
			}
			catch (Exception e) {
				System.out.println("las estatura y peso no admiten puntos como separador decimal se debe de usar la coma");
			}
			System.out.println("ingrese la posicion del jugador");
			jugador.setPosicion(sc.next());
			lista.add(jugador);
		break;
		
		case 2:
			boolean encontrar = false;
			System.out.println("Ingrese el nombre del jugador que desea consultar");
			String nomb = sc.next();
			System.out.println("ingrese el apellido del jugador que desea consultar");
			String ape = sc.next();
			for(int i = 0; i < lista.size(); i++) {
				Jugador elemento = lista.get(i);
				if((elemento.getNombre().equals(nomb)) && (elemento.getApellido().equals(ape))) {
					System.out.println(lista.get(i));
					encontrar = true;
				}
			}
			
			if(encontrar == false) {
				System.out.println("el jugador no existe");}
		break;
		
		case 3:
			if(!(lista.isEmpty())) {
			lista.sort(Comparator.comparing(Jugador::getApellido));
			lista.forEach(list -> System.out.println(list));
			}
			else {
				System.out.println("la lista esta vacia");}
		break;
		
		case 4:
			boolean encontro = false;
			System.out.println("Ingrese el nombre del jugador que desea consultar");
			String nombre = sc.next();
			System.out.println("ingrese el apellido del jugador que desea consultar");
			String apellido = sc.next();
			for(int i = 0; i < lista.size(); i++) {
				Jugador elemento = lista.get(i);
				if((elemento.getNombre().equals(nombre)) && (elemento.getApellido().equals(apellido))) {
					System.out.println("ingrese el nombre del jugador:");
					elemento.setNombre(sc.next());
					System.out.println("ingrese el apellido del jugador:");
					elemento.setApellido(sc.next());
					try {
						System.out.println("ingrese fecha de nacimiento (dd/MM/yyyy):");
						String fecha_nac = sc.next();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate fecha_nacimiento = LocalDate.parse(fecha_nac, formatter);
						elemento.setFecha_nac(fecha_nacimiento);
						}
						catch (Exception e) {
							System.out.println("El formato de la fecha debe de ser dd/mm/yyyy de otra forma se estara cometiendo un error");
						}
					System.out.println("ingrese la nacionalidad del jugador:");
					elemento.setNacionalidad(sc.next());
					try {
						System.out.println("ingrese la estatura del jugador");
						elemento.setEstatura(sc.nextDouble());
						System.out.println("ingrese el peso del jugador");
						elemento.setPeso(sc.nextDouble());
						}
						catch (Exception e) {
							System.out.println("las estatura y peso no admiten puntos como separador decimal se debe de usar la coma");
						}
					System.out.println("ingrese la posicion del jugador");
					elemento.setPosicion(sc.next());
					encontro=true;
				}
			}
			if(encontro==false) {
				System.out.println("el jugador buscado no existe");}
		break;
		
		case 5:
			boolean encontrado = false;
			System.out.println("Ingrese el nombre del jugador que desee eliminar");
			String nom = sc.next();
			System.out.println("ingrese el apellido del jugador que desee eliminar");
			String app = sc.next();
			
			Iterator<Jugador> iterator = lista.iterator();
			while(iterator.hasNext()) {
				Jugador j = iterator.next();
				if((j.getNombre().equals(nom)) && (j.getApellido().equals(app))){
				iterator.remove();
				encontrado=true;}
			}
			
			if (encontrado == true) {
				System.out.println("el elemento fue removido");}
			else {
				System.out.println("el elemento no existe");}
		break;
		
		case 6:
			int cont=0;
			for(int i = 0; i < lista.size(); i++) {
				cont++;
				}
			System.out.println("La lista contiene "+ cont + " elementos");
			
		break;
		
		case 7:
			System.out.println("ingrese la nacionalidad que desea consultar");
			String nac = sc.next();
			int contador=0;
			for(int i = 0; i < lista.size(); i++) {
				Jugador elemento = lista.get(i);
				if(elemento.getNacionalidad().equals(nac)) {
					contador++;
				}
				}
			System.out.println("La lista contiene "+ contador + " jugador/es de la nacionalidad " + nac);
		break;
		
		case 8:
			System.out.println("Saliendo del programa");
		break;
		
		default:
			System.out.println("opcion no valida");
		}
		
		}
		while(op != 8);
		

	}

}
