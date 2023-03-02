package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestaTest {
	

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

		
	@Test
	public void testResta() {
		
		// ejecuto la resta
				int resultado = Resta.resta(2, 3);
				
		// con esto verificamos que el resultado es el esperado
		assertEquals(-1, resultado);
	}

}
