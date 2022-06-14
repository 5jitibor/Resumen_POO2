package bloque2.listas;

import java.util.ArrayList;

public class PruebaArrayList {
	public static void main(String[] args) {
		//Para inicializar un ArrayList de enteros es asi
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		//Lo que se pone entre<> es el tipo de datos que vamos a guardar en esa lista
		//¡OJO! acuerdate de que inicializarlo como atributo es como lo explicamos en bloque1.clase
		
		//Tienes diferentes metodos:
		listaEnteros.add(4); // Añade ese valor en la posicion 0
		listaEnteros.add(1,3); // Añade el valor 3 en la posicion 1
		listaEnteros.get(0); // Te da el valor de esa posicion
		listaEnteros.remove(0); // Te elimina el dato y te lo devuelve de esa posicion
		listaEnteros.indexOf(4); //Te devolvera la posicion del elemento 4
		listaEnteros.size();// Para saber el tamaño del array
		
		
		// si queremos ver todo el arraylist usa este tipo de for:
		for(int num : listaEnteros) {
			System.out.println(num);
		}
		// Dentro del for es la variable que "itera" luego dos puntos y por ultimo el nombre del ArrayList
		
	}
}
