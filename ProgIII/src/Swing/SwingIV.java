package Swing;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaFormas v = new VentanaFormas();
		v.setVisible(true);
	}

}

class VentanaFormas extends JFrame {
	
	public VentanaFormas() {
		
		setTitle("Ventana con diferentes formas");
		setSize(600,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		LaminaConFiguras l = new LaminaConFiguras();
		add(l);
		
	}
}

class LaminaConFiguras extends JPanel {
	
public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		g.drawRect(50, 50, 200, 200);
		g.drawLine(100, 100, 300, 200);
		g.drawArc(50, 100, 100, 200, 120, 150);
		
		
	}
}
