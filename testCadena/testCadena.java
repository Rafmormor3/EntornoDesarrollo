package testCadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCadena {

	@Test
	void testEsMayuscula() {
		Cadena c = new Cadena("HOLA");
		assertTrue(c.estaEnMayuscula());
	}
	
	@Test
	void vacioNoMayuscula() {
		Cadena c = new Cadena("");
		assertFalse(c.estaEnMayuscula());
	}
	
	
	@Test
	void nullNoMayuscula() {
		Cadena c = new Cadena(null);
		assertNull(c.toMayuscula());
	}
	
	
	@Test
	void testEsMinuscula() {
		Cadena c = new Cadena("hola");
		assertTrue(c.estaEnMinuscula());
	}
	
	@Test
	void vacioNoMinuscula() {
		Cadena c = new Cadena("");
		assertFalse(c.estaEnMinuscula());
	}
	
	@Test
	void nullNoMinuscula() {
		Cadena c = new Cadena(null);
		assertNull(c.toMinuscula());
	}
	
	@Test
	void vacioNoCapicua() {
		Cadena c = new Cadena("");
		assertFalse(c.capicua());
	}
	
	@Test
	void testCapicua() {
		Cadena c = new Cadena("1234321");
		assertTrue(c.capicua());
	}
	
	@Test
	void vacioNoPalindroma() {
		Cadena c = new Cadena("");
		assertFalse(c.palindromo());
	}
	
	@Test
	void testPalindromo() {
		Cadena c = new Cadena("ana");
		assertTrue(c.palindromo());
	}
	
	@Test
	void testEsDecimal() {
		Cadena c = new Cadena("4.5");
		assertTrue(c.esDecimal());
	}
	
	@Test
	void VacioNoEsDecimal() {
		Cadena c = new Cadena("");
		assertFalse(c.esDecimal());
	}
	
	@Test
	void VacioNoEsEntero() {
		Cadena c = new Cadena("");
		assertFalse(c.esEntero());
	}
	
	@Test
	void testEsEntero() {
		Cadena c = new Cadena("55.6");
		assertFalse(c.esEntero());
	}
	
	
	
	
	
	
	
	
	
	
}
