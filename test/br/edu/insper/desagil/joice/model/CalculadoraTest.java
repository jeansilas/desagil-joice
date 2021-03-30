package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void niobio() {
		CalculadoraCCC calculadora = new CalculadoraCCC("CCC");
		assertEquals(8.57,calculadora.calcula(92.91,0.143),0.05);
		
	}
	
	public void cobre() {
		CalculadoraCFC calculadora = new CalculadoraCFC("CFC");
		assertEquals(8.89,calculadora.calcula(63.55,0.128),0.05);
	}
	
	
	public void tungstenio() {
		CalculadoraCCC calculadora = new CalculadoraCCC("CCC");
		assertEquals(19.28,calculadora.calcula(183.84,0.137),0.05);
	}
	
	public void ouro() {
		CalculadoraCFC calcuadora = new CalculadoraCFC("CFC");
		assertEquals(19.36,calculadora.calcula(196.97,0.144),0.05);
	}
	
	public void litio() {
		CalculadoraCCC calculadora = new CalculadoraCCC("CCC");
		assertEquals(0.53,calculadora.calcula(6.94,0.152),0.05);
	}
	
	public void prata() {
		CalculadoraCFC calculadora = new CaculadoraCFC("CFC");
		assertEquals(10.60,calculadora.calcula(107.87,0.144),0.05);
	}
}
