package bloque2.excepciones;


//Si quieres crear una excepcion te creas una clase como esta que extenda de Exception u otro tipo si te lo pone en el enunciado
//Solo hacer esto cuando te lo indique el enunciado
public class ExceptionNumeroNegativo extends Exception {
	
	//En el constructor super
	public ExceptionNumeroNegativo() {
		super();
	}
	
	
	//Tienes esta funcion que es para poner que mensaje quieres que salga
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Error: numero negativo";
	}
	
	
	//Este es para mostrar el rastreo del error(desde donde salta hasta donde recoge(el catch))
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
	
	//No es necesario hacer override de todas solo las que necesites cambiar algun mensaje

}
