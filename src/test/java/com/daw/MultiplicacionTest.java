package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicacionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@Test
	public void testMultiplicar() {
		//Multiplicacion m = new Multiplicacion(2,3);
		assertTrue (6== Multiplicacion.multiplicar(2, 3));
		
	}

}
