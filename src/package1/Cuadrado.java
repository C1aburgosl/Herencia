package package1;

public class Cuadrado extends Figura {

	private double lado;
	
	
	public Cuadrado(double l){
		
		lado = l;
		
		//Atributo de Figura
		numeroDeLados = 4;
		
		//Variable global
		numeroDeFiguras++;
	}
	
	public double area(){
		return lado*lado;
	}
	
	public String toString(){
		return "Valores del Cuadrado\n" +
			   "-----------------------\n" +
			   "Lado = " + lado + "\n" +
			   "area = " + area() + "\n" +
			   "Numero de Lados = " + numeroDeLados + "\n" +
			   "Figuras Totales = " + numeroDeFiguras;
	}
}
