package bloque3.arbol;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


public class TestExample {

	static JLabel label;
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		MyDataModel mdm = new MyDataModel();
		
		
		JTree tree = new JTree(mdm);
		
		
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				
				//label.setText(e.getNewLeadSelectionPath().toString());
				Object selection = tree.getLastSelectedPathComponent();
				if(selection instanceof Grupo) {
					label.setText("Has seleccionado un grupo con personas: "+((Grupo)selection).personasDelGrupo.size());
				}
				else if(selection instanceof Persona)
				{
					label.setText("Has seleccionado una persona de edad: "+((Persona)selection).getEdad());
				}
			}
		});
		
//		tree.addTreeExpansionListener(new TreeExpansionListener() {
//			
//			@Override
//			public void treeExpanded(TreeExpansionEvent event) {
//				frame.repaint();
//				
//			}
//			
//			@Override
//			public void treeCollapsed(TreeExpansionEvent event) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		 
		JScrollPane scroll = new JScrollPane(tree);
		
		scroll.setBackground(Color.RED);
		
		frame.add(scroll,BorderLayout.CENTER);
		
		
		label = new JLabel("Hola");
		
		frame.add(label,BorderLayout.SOUTH);
		
		
		JButton button = new JButton("change Mode");
		
		frame.add(button,BorderLayout.NORTH);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mdm.invertMode();	
			}
		});
		
		frame.setVisible(true);
	}
}
