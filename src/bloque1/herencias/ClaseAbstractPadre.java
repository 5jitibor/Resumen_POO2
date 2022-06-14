package bloque1.herencias;


//La clase abstract es muy parecida a una clase normal pero hay dos cosas diferentes
//1. No puedes crear objetos de esta instancia es decir ClaseAbstractPadre = new ClaseAbstractPadre(2,3); dara error
//2. Puedes crear funciones abstractas que lo que hace es que cuando heredas esta clase obligas a que hagas estas restas
public abstract class ClaseAbstractPadre {
	protected int num1;
	protected int num2;
	
	public ClaseAbstractPadre(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int sumar() {
		return num1+num2;
	}
	
	public int multiplicar() {
		return num1*num2;
	}
	
	//Asi es como se inicializa el metodo en la clase padre
	public abstract int restar();
}
