package bloque3.arbol;

import java.util.ArrayList;

public class Grupo {
	
	public ArrayList<Persona> personasDelGrupo;
	public ArrayList<Grupo> gruposDelGrupo;
	public String nombre;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		personasDelGrupo = new ArrayList<>();
		gruposDelGrupo = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
}
