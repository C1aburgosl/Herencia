package package1;
import miLibreria.Entrada;

public class EjemploHerencia {

	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		Cuadrado cuadrado;
		Triangulo triangulo;
		
		System.out.println("Introduccion de los datos del triangulo");
		triangulo = new Triangulo (entrada.obtenerFloat("Dame la base"),entrada.obtenerFloat("Dame la altura"));
		
		System.out.println(triangulo.toString());
		System.out.println();
		
		System.out.println("Introduccion de los datos del cuadrado");
		cuadrado = new Cuadrado (entrada.obtenerFloat("Dame el lado"));
		
		System.out.println(cuadrado.toString());
		System.out.println();
		System.out.println(triangulo.toString());

	}

}
