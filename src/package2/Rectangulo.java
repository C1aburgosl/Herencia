package package2;

public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Rectangulo(double b, double a){
		base = b;
		altura = a;
		numeroDeLados = 4;
		numeroDeFiguras++;
		
	}
	public double Perimetro(){
		return (base+altura)*2;
		
	}
	
	public String toString(){
		return "Valores del Rectangulo\n" +
			   "-----------------------\n" +
			   "Base = " + base + "\n" +
			   "Altura = " + altura + "\n" +
			   "Perimetro = " + Perimetro() + "\n" +
			   "Numero de Lados = " + numeroDeLados + "\n" +
			   "Figuras Totales = " + numeroDeFiguras;
	}

}
