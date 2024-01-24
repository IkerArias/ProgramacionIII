package Swing;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VentanaConTexto v = new VentanaConTexto();
		v.setVisible(true);
	}

}

class VentanaConTexto extends JFrame {
	
	public VentanaConTexto() {
		
		setTitle("Ventana con texto");
		setSize(600,800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Lamina l = new Lamina();
		add(l);
		
	}
}

class Lamina extends JPanel {
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Esto es una ventana de prueba", 100, 100);
	}
}
