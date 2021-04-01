package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {


	public CalculadoraCCC() {
		super("CCC");
	}

	public double volume(double raio) {
		double numerador = 4*raio;
		double denominador = Math.sqrt(3);
		
		return Math.pow((numerador/denominador),3);
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double Na = 6.023 * 1e23 ;
		int n = 2;
		raio = raio*1e-7;
		
		double densidade = (n*peso)/(Na*volume(raio));
		
		return densidade;
		
	}
	
}
