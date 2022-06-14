package bloque2.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FicherosLectura {
	
	  // Esta funcion es para obtener los datos de un fichero, donde llames tendras que poner un try catch
	  public static String escribirFicheroScanner(String a) throws IOException {

	        Scanner s = null;
	        String data = "";

	        try {
	            s = new Scanner(new BufferedReader(new FileReader(a)));
	            s.useDelimiter(";");
	            while (s.hasNext()) {
	                data += s.next();
	            }
	        } finally {
	            if (s != null) {
	                s.close();
	            }
	        }
	        
	        return data;
	        
	  }
}
