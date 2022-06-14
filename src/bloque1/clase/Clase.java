package bloque1.clase;

// Tiene cuatro areas 

public class Clase {

	// Primera area los atributos
	
	Object num; // esto es una variable que puede ser de muchos tipos(int,long,float,double...), sin poner nada mas puede acceder todas las clases 
			 //que esten dentro del mismo paque o sus hijas
	
	private float num2;// Si añadimos private, solo podran acceder a esta varible ella misma(es decir dentro de la clase), 
					   // es la que tienes que poner a los atributos si no hereda nadie de esta clase (siendo esta el padre).
	public double num3; // Si añadimos public, lo puede ver todo el mundo(nunca exceptuando si te lo indica el enenunciado)
	protected long num4; // Si añadimos protected es lo mismo que private pero añadiendo que tambien lo podemos poder utilizar en clases hijas
					     // Solo se usa si esta clase es heredada de otra(siendo esta el padre).
	
	final boolean bool = false; // Si añadimos el final es una constante ya que no se puede cambiar el valor nunca mas y siempre hay que iniciarla
								//aqui(si no te saldra aqui)
	
	static int num5= 7; // Es un tipo de variable que sera igual siempre en todos los objetos de esta clase es decir que si lo cambias de un objeto
					    //el valor a 5 valdra 5 en el resto y si es accesible se pone Clase.num5 es decir nombre de clase, punto y nombre 
					    //de la variable estatica.(Es recomendable iniciarla aqui)
	
	private final static float num6= 8;// Este seria el orden de las palabras que puedes ponerle
									   // 1. Private, public , protected o nada
									   // 2. Final o no
									   // 3. Static o no
									   // 4. Tipo de variable (int,float,double,long,boolean o un Objeto)
									   // 5. nombre de la variable.

	
	

	// Segunda area los getters and setters, sirven cuando no puedas acceder directamente.
	// Setters para cambiar el valor completo(si es un objeto el dato guardado y quieres cambiar algun atributo de ese objeto usar get)
	//Puedes generarlos poniendote en la linea y seleccionar Source->Generate getters and setters
	
	public Object getNum() {
		return num;
	}

	public void setNum(Object num) {
		this.num = num;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

	public long getNum4() {
		return num4;
	}

	public void setNum4(long num4) {
		this.num4 = num4;
	}

	public static int getNum5() {
		return num5;
	}

	public static void setNum5(int num5) {
		Clase.num5 = num5;
	}

	public boolean isBool() {
		return bool;
	}

	public static float getNum6() {
		return num6;
	}

	
	//Tercer area el constructor
	//Puede haber mas de un constructor en una clase cada constructor se diferencia por los parametros que les pasas
	//Un constructor se estructura poniendo public ,luego el nombre del constructor, los pareametros
	//(que van entre parentesis) por ultimo las llaves donde inicializaremos los atributos
	//Dentro del constructor inicializaras todas las variables que no sean ni final o static(esta ultima es opcional)
	
	public Clase() {
		num = new Object(); //Asi se inicializa cualquier clase(Exceptuando las clase de Listas(AAsrrayList,Set,HasMap...)
		                    //que se inicializa explicado en el bloque de arrays)
		num2 = 0;
		num3 = 0;
		num4 = 0;
		num5 = 0; // No se suele hacer porque es static pero es posible
		//bool = true; //Da error si intentamos cambiarlo
	}
	
	//Este es otro constructor pero en este le pasamos todos los parametros
	public Clase(Object num, float num2, double num3, long num4) {
		super();
		this.num = num;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	
	//Esta ultima parte son las funciones
	// estos tienen las propiedades de public, private o protected y funcionan igual
	//Los parametros que les pasas solo funcionan dentro de la funcion
	
	public void function1() {
		
	}
	
	protected void function2(int numAux) {
		
	}
	
	private void function3(int numAux) {
		
	}
	
	//Tambien funciona el static y tienen las mismas propiedades lo unico que cuando lo llames se llama asi Clase.function4()
	
	public static void function4() {
		
	}
	
	//Tambien puede ser final y es que no se puede cambiar ningun valor de ningun atributo(No se suele usar )
	
	public final void function5() {
		
	}
	
	//Tambien acuerdate que puedes devolver cuanlquier valor(Int,float,double,long)
	
	public int function6(int numAux) {
		
		return numAux+num5;
	}
	
	//Asi que la estructura maxima puede ser(te puede servir de ayuda para saber que va antes o despues)
	
	public static final void function7() {
		
	}
	
}	
