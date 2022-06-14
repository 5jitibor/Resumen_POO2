package bloque1.herencias;

//Para heredar clases le ponemos extends y seguido de la clase que quieres heredar
public class ClaseNormalHija extends ClaseNormalPadre  {
	
	//Aqui si le ponemos private en las clases hijas
	private int num3;
	
	//En el constructor primero de todo tenemos que añadir el super priemro y luego inicializar el resto de variables de la hija
	public ClaseNormalHija(int num1, int num2, int num3) {
		super(num1, num2);
		this.num3 = num3;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public int getNum3() {
		return num3;
	}





	public void setNum3(int num3) {
		this.num3 = num3;
	}





	//En la columna de derecha del todo hay un flecha que indica que esta override es decir le hemos cambiado el contenido de la funcion padre o con el @override(es opcional)
	@Override
	public int sumar() {
		return num1+num2+num3;
	}

	//Esta funcion solo se podra usar si el objeto es una clase hija(es decir si lo guardas como clase padre no podras entrar)
	public int restar() {
		return num1-num2-num3;
	}
	
}
