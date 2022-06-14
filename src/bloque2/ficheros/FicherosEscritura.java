package bloque2.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FicherosEscritura {
	// Esta funcion es para escribir los datos en un fichero, donde llames tendras que poner un try catch
	public static void crearFichero(String data) throws IOException {

			BufferedWriter out = null;
			try {
				out = new BufferedWriter(new FileWriter("fichero.txt"));
				out.write(data);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(out != null) {
					out.close();
				}
			}
			
		
		
	}
}
