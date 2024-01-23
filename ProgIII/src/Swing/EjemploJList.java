package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;



/* 
 * Ejemplo de JList con renderizados
 */

public class EjemploJList {
	
	//Metodo principal
	public static void main(String[] args) {
		//Inicializar la ventana
		JFrame f = new JFrame();
		f.setTitle("Estadisticas delanteros LaLiga");
		f.setSize(800,600);
		//Crear la lista 
		DefaultListModel<Jugador> m1 = new DefaultListModel<>();
		m1.addElement(new Jugador("Bellingham","Real Madrid",14));
		m1.addElement(new Jugador("Dovbyk","Girona",14));
		m1.addElement(new Jugador("Morata","Atletico de Madrid",13));
		m1.addElement(new Jugador("Borja Mayoral","Getafe FC",13));
		m1.addElement(new Jugador("Griezmann","Atletico de Madrid",11));
		m1.addElement(new Jugador("Gerard","Villareal CF",9));
		m1.addElement(new Jugador("Williams","Athletic Club",8));
		//Lista 1
		JList<Jugador> l1 = new JList<Jugador>(m1);
		l1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		f.add(new JScrollPane(l1), BorderLayout.WEST);
		//Lista 2
		JList<Jugador> l2 = new JList<Jugador>( m1 );
		l2.setCellRenderer( new MiRenderer() );
		l2.setFont( new Font( "Times New Roman", Font.ITALIC, 20 ));
		f.add( new JScrollPane(l2), BorderLayout.CENTER );
		f.setVisible(true);
		
		
		
		
	}
	@SuppressWarnings("serial")
	//MiRenderer para lista2
	private static class MiRenderer extends DefaultListCellRenderer {
		private JPanel miPanel;
		private JProgressBar miPB;
		private JLabel miLabel1;
		//Constructor
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
			if (miPanel==null) {
				miPanel = new JPanel();
				miPanel.setLayout( new BorderLayout() );
				miLabel1 = new JLabel( "" );
				miLabel1.setBackground( Color.white );
				miLabel1.setOpaque( true );
				miLabel1.setFont( new Font( "Times New Roman", Font.PLAIN, 20 ));
				miPB = new JProgressBar( 0, 30 );
				miPanel.add( miLabel1, BorderLayout.CENTER );
				miPanel.add( miPB, BorderLayout.EAST );
			}
			if (isSelected) {  // Para diferenciar las filas seleccionadas del JLabel
				miLabel1.setBackground( Color.LIGHT_GRAY );
			} else {
				miLabel1.setBackground( Color.WHITE );
			}
			Jugador j = (Jugador)value;
			miLabel1.setText(j.nombre);
			miPB.setValue((int) j.goles);
			return miPanel;
		}
		
	}
	
	
	//Clase Jugador
	private static class Jugador {
		String nombre;
		String equipo;
		int goles;
		//Constructor
		public Jugador(String nombre, String equipo, int goles) {
			super();
			this.nombre = nombre;
			this.equipo = equipo;
			this.goles = goles;
		}
		//Metodo toString
		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", equipo=" + equipo + ", goles=" + goles + "]";
		}
		
	}

}
