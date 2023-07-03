package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.sumar(2, 3);
		//Para esta prueba espero que la suma me de 5
		assertEquals(5, resultado); //lo que espero, lo que tengo

	}//Test sumar
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.Multiplicar(2, 3);
		//Para esta prueba espero que la multiplicacion me de 6
		assertEquals(6, resultado);//lo que espero, lo que tengo

	} //Test Multiplicar
	@Test
	void testDividir() {
		float resultado = Calculadora.Dividir(6.0f, 2.0f);
		//Para esta prueba espero que la multiplicacion me de 6
		assertEquals(3, resultado);//lo que espero, lo que tengo

	}//Test Dividi

}
