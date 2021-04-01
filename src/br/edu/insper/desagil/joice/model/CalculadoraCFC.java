package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {




	public CalculadoraCFC() {
		super("CFC");
		
	}


	public double volume(double raio) {
		double volume = Math.pow(Math.sqrt(8)*raio, 3);
		return volume;
	}
	
	
	
	@Override
	public double calcula(double peso, double raio) {
		double na = 6.023 * 1e23 ;
		int n = 3;
		raio = raio*1e-7;
		
		double densidade = (n*peso)/(na*volume(raio));
		
		return densidade;
		
	}
}
