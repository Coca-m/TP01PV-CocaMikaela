package ar.edu.unju.fi.ejercicio9.main;

import java.util.*;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Producto producto = new Producto();
		
		System.out.println("ingrese la cantidad de productos que desea registrar");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("\ningrese el nombre del producto");
			producto.setNombre(sc.nextLine());
			System.out.print("ingrese codigo del producto" );
			producto.setCodigo(sc.nextInt());
			System.out.println("ingrese precio del producto");
			producto.setPrecio(sc.nextDouble());
			do {
				System.out.println("ingrese el descuento que queria aplicar (solamente se permite descuentos del 0% al 50%)");
				producto.setDescuento(sc.nextInt());
			}while(producto.getDescuento()<0 || producto.getDescuento()>50);
			double precio_descuento = producto.calcularDescuento(producto.getDescuento(), producto.getPrecio());
			
			System.out.println("Nombre del producto: "+ producto.getNombre());
			System.out.println("Codigo del producto: "+ producto.getCodigo());
			System.out.println("Precio del producto$: "+ producto.getPrecio());
			System.out.println("Descuento aplicado:"+ producto.getDescuento()+"%");
			System.out.println("Precio con descuento aplicado$: "+ precio_descuento);
		}
		

	}

}
