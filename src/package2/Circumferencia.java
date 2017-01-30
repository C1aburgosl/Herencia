package package2;

public class Circumferencia  extends Figura {
	
	private double radio;
	
	public Circumferencia(double r){
		radio=r;;
		
		numeroDeFiguras++;
		
	}
	public double Perimetro(){
		return 2*radio*3.14;
		
	}
	
	public String toString(){
		return "Valores de la circumferencia\n" +
			   "-----------------------\n" +
			   "Radio = " + radio + "\n" +
			   "Perimetro = " + Perimetro() + "\n" +
			   "Figuras Totales = " + numeroDeFiguras;
	}
}
