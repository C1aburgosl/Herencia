package package2;

public abstract class Figura {

	protected static int numeroDeFiguras = 0;
	protected int numeroDeLados;
	protected double longitudLado;
	
	public double Perimetro(){
		return numeroDeLados*longitudLado;
	}
	
	
}
