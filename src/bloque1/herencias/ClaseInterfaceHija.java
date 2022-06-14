package bloque1.herencias;

//Ponemos implements y seguido va el nombre de la interfaz
public class ClaseInterfaceHija  implements ClaseInterfacePadre{
	//Aqui hay que poner las variables(las 3 ya que la interfaz no puede tener clases)
	
	private int num1;
	private int num2;
	private int num3;
	
	ClaseInterfaceHija(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}


	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	
	//Estamos obligados a crear estas funcones(lo indica con override o con una flecha azul y blanca)

	@Override
	public int sumar() {
		// TODO Auto-generated method stub
		return num1+num2+num3;
	}

	@Override
	public int restar() {
		// TODO Auto-generated method stub
		return num1-num2-num3;
	}

	@Override
	public int multiplicar() {
		// TODO Auto-generated method stub
		return num1*num2*num3;
	}

}
