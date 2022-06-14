package bloque1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bloque1.herencias.ClaseAbstractHija;
import bloque1.herencias.ClaseNormalHija;


//Cuando creemos un test tienes que hacer es click derecho-> new -> Junit test Case, le indicas nombre y si te dice importar le das okay
class Tests {

	//Esto es un dominio es decir un conjunto de test que puedes hacer
	@Test
	void test() {
		//He creado un objeto de esta clase para realizar prueba
		ClaseNormalHija claseNormal = new ClaseNormalHija(1, 2, 3);
		
		
		//Entonces tienes assertEquals que comprueba si el valor es el correcto
		assertEquals(claseNormal.sumar(), 6);
		
		//Entonces tienes assertNot Equals que comprueba si el valor es diferente al valor correcto(indicado en la funcion)
		assertNotEquals(claseNormal.sumar(), 5);
		
		/*
		 * Para si es booleano el resultado puedes poner:
		 * assertTrue(funcion()) que es para cuando es correcto devuelva true
		 * assertFalse(funcion()) que es para cuando es correcto devuelva false
		 */
		
	}
	
	
	//Puedes hacer mas de un dominio
	@Test
	void test2() {
		ClaseAbstractHija claseNormal = new ClaseAbstractHija(1, 2, 3);
		
		
		//Estos daran error ambos
		assertEquals(claseNormal.multiplicar(),3);
		
		assertNotEquals(claseNormal.multiplicar(), 2);
	}
	
	
	

}
