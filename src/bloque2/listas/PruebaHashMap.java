package bloque2.listas;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PruebaHashMap {
	public static void main(String[] args) {
		//Para inicializar un hashMap de enteros es asi
		LinkedHashMap<Integer,Integer> hashMapEnteros = new LinkedHashMap<Integer,Integer>();
		//Lo que se pone entre<> es el el tipo de valor de clave y  tipo de datos que vamos a guardar en esa lista, en este orden
		//¡OJO! acuerdate de que inicializarlo como atributo es como lo explicamos en bloque1.clase
		
		//Tienes diferentes metodos:
		hashMapEnteros.put(2, 2);// Añade el valor 2 con la clave 2
		hashMapEnteros.get(0); // Te da los valores de esa clave
		hashMapEnteros.remove(0); // Te elimina la clave y sus valores con el valor 0 con sus valores
		hashMapEnteros.remove(0,0); // Te elimina la clave si esta relacionado con el segundo valor
		hashMapEnteros.size();// Para saber el tamaño del array de claves
		
		//Para reccorrer todos los elementos 
		//Se hace este for que te da la clave y el valor al mismo tiempo
		for(Entry<Integer, Integer> num: hashMapEnteros.entrySet()) {
			System.out.print(num.getKey() + "->" + num.getValue()+" ");
		}
		
	}
}
