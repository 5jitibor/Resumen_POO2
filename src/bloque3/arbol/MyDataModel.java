package bloque3.arbol;

import java.util.ArrayList;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class MyDataModel implements TreeModel {

	
	Grupo root;
	Grupo selected;
	
	boolean showFiles = false;
	
	ArrayList<TreeModelListener> listenerList = new ArrayList<>();
	
	public MyDataModel() {
		
		root = new Grupo("ROOT");
		for(int i=0;i<10;i++) {
			root.personasDelGrupo.add(new Persona("GR", "P"+i, i));
			
			Grupo g = new Grupo("G1-"+i);
			for(int s = 0; s< 12;s++) {
				g.personasDelGrupo.add(new Persona("G1-"+i,"PG-"+s,i));
			}
			root.gruposDelGrupo.add(g);
		}
		
		selected = root;
	}
	
	
	public void invertMode() {
		showFiles = !showFiles;
		
		System.out.println("Cambio el modo");
		//algo m�s para lanzar el evento, para informar a todo el mundo que algo ha cambiado.
		fireTreeStructureChanged();
	}
	
	
	@Override
	public Object getRoot() {
		
		return root;
	}

	@Override
	public int getChildCount(Object parent) {
		if(parent instanceof Grupo) {
			Grupo p = (Grupo)parent;
			
			if(showFiles)
				return p.gruposDelGrupo.size() + p.personasDelGrupo.size();
			else
				return p.gruposDelGrupo.size();
		}
		return 0;
	}
	
	@Override          //10    7
	public Object getChild(Object parent, int index) {
		
		if(parent instanceof Grupo) {
			
			Grupo p = (Grupo)parent;
			
			if(showFiles) {
				
				if(index >= p.gruposDelGrupo.size()) {
					index -= p.gruposDelGrupo.size();
					return p.personasDelGrupo.get(index);
				}
				else {
					return p.gruposDelGrupo.get(index);
				}
			}
			else {
				return p.gruposDelGrupo.get(index);
			}
		}
		return null;
	}

	

	@Override
	public boolean isLeaf(Object node) {
		
		return node instanceof Persona;
		
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		
		Grupo p = (Grupo)parent;
		
		if(child instanceof Grupo)
		
			return p.personasDelGrupo.indexOf(child);
		
		else {
			return p.gruposDelGrupo.size() + p.personasDelGrupo.indexOf(child);
		}
		
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		listenerList.add(l);
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		listenerList.remove(l);
	}
	
	protected void fireTreeNodeInserted() {
		
		
		
	}
	protected void fireTreeNodeRemoved() {
			
	}
	protected void fireTreeNodeChanged() {
		
	}
	protected void fireTreeStructureChanged() {
		
		TreeModelEvent event = new TreeModelEvent(this, (TreePath)null);
		
		for(TreeModelListener l : listenerList)
			l.treeStructureChanged(event);
		
	}

}
