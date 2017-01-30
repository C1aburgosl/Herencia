package package2;

import miLibreria.Entrada;

public class EjemploHerencia {
	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		Rectangulo rectangulo;
		Circumferencia circumferencia;
		
		System.out.println("Introduccion de los datos del rectangulo");
		rectangulo = new Rectangulo (entrada.obtenerFloat("Dame la base"),entrada.obtenerFloat("Dame la altura"));
		
		System.out.println(rectangulo.toString());
		System.out.println();
		
		System.out.println("Introduccion de los datos del cuadrado");
		circumferencia = new Circumferencia (entrada.obtenerFloat("Dame el radio"));
		
		System.out.println(circumferencia.toString());
		System.out.println();
		System.out.println(rectangulo.toString());

	}

}
