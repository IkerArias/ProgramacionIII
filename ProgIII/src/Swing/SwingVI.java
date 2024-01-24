package Swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaColores v = new VentanaColores();
        v.setVisible(true);
	}

}

class VentanaColores extends JFrame {
	
	public VentanaColores() {
		
		setTitle("Ventana con diferentes colores");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		
		LaminaConColores l = new LaminaConColores();
		add(l);
		l.setBackground(Color.PINK);
	}
}

class LaminaConColores extends JPanel {
	
	public void paintComponent(Graphics g) {
	
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    
    g2.setPaint(Color.RED);
    
    Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
    g2.fill(rectangulo);
    
    Ellipse2D elipse = new Ellipse2D.Double();
    elipse.setFrame(rectangulo);
    Color miColor = new Color(0,140,255);
    g2.setPaint(miColor.brighter());
    g2.fill(elipse);
    
	}
	
}
