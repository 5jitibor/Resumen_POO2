package bloque1.herencias;

//Para heredar clases le ponemos extends y seguido de la clase que quieres heredar
public class ClaseAbstractHija extends ClaseAbstractPadre  {
	
	//Aqui si le ponemos private en las clases hijas
	private int num3;
	
	public ClaseAbstractHija(int num1, int num2,int num3) {
		super(num1, num2);
		this.num3 = num3;
	}
	
	//En la columna de derecha del todo hay un flecha que indica que esta override es decir le hemos cambiado el contenido de la funcion padre
	public int sumar() {
		return num1+num2+num3;
	}

	//Esta funcion estamos obligados a crear ya que en la clase padre esta creada como abstract como indica el @override(opcional, si no en esa misma se indica con
	// un flecha azul y blanca)
	@Override
	public int restar() {
		// TODO Auto-generated method stub
		return num1-num2-num3;
	}

	
}
