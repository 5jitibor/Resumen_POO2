package bloque2.claseFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class ClaseFile {
	public static void main(String[] args) {
		/**Primero necesitamos tener la path
		*1. Con un JfileChooser, puedes obtener la direccion de una carpeta o archivo
		*2. Escribiendolas a mano, para westa ultima tenemos la clase Path o File
		**/
		
		//Este sirve si queremos trabajar solo con el string
		Path path = Paths.get("/Documents");//El string es la direccion de archivo o carpeta
		
		
		//Si queremos trabajar con el archivo o carpeta usar este
		
		File file = new File("/Documents");
		
		// https://docs.oracle.com/javase/8/docs/api/java/io/File.html aqui tienes todas las propiedades de la clase File
		
		//Si quieres tener mas atributos usa BasicFileAttributes
		//Si solo pones la linea te dara una opcion entonces seleccionas como solucion try catch
		try {
			BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**https://docs.oracle.com/javase/8/docs/api/java/nio/file/attribute/BasicFileAttributes.html aqui
		 * tienes todas las propiedas de BasicFileAttributes
		 */
		
		
		
		
		
		
		
	}
}
