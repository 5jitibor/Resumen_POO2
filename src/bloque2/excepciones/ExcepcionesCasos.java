package bloque2.excepciones;
//esta clase es un ejemplo del try catch
public class ExcepcionesCasos {
	public static void main(String[] args) {
		//Lo que pongamos dentro del try es lo que queremos ejecutar y puede saltar error
		try {
			checkNumero(10);
		//Catch es lo que queremos que haga cuando haya error
		} catch (ExceptionNumeroNegativo e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Esto siempre se ejecutara cuando vaya al catch o no
		finally {
			System.out.println("Termine!!");
		}
		
	}
	
	/*Si ponemos throws en una funcion es que alguna funcion anterior a esta tiene que capturar el error sino
	 * saldra error cuando programes
	 */
	
	public static int checkNumero(int numero) throws ExceptionNumeroNegativo {
		if(numero<0) {
			//El throw es para lanzar el error
			throw new ExceptionNumeroNegativo();
		}
		else if(numero>10) {
			throw new IndexOutOfBoundsException();
		}
		return numero;
	}
}

/* Todo esto se puede generar automaticamente si te pones encima del error de la funcion
 * que contiene el throw o en el mismo throw y te saldran dos opciones:
 * 1. Poner throws en la funcion 
 * 2. Poner un try- catch
 * Tendras que elegir donde ponerlo:
 * 1. Donde haya un throw ponle a la funcion un throws el resto de casos lo tienes que valorar donde lo tiene que capturar
 * */
