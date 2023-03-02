package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumaTest {
	
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSuma() {

		// ejecuto la suma
		int resultado = Suma.suma(2, 3);
		
		// con esto verificamos que el resultado es el esperado
		assertTrue(resultado==5);
	}

	

}
