package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingVII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaFuentes v = new VentanaFuentes();
        v.setVisible(true);
	}

}

class VentanaFuentes extends JFrame {
	
	public VentanaFuentes() {
		
		setTitle("Ventana con diferentes fuentes");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		
        LaminaFuentes l = new LaminaFuentes();
        add(l);
        l.setBackground(Color.lightGray);
		
	}
}

class LaminaFuentes extends JPanel {
	
	public void paintComponent(Graphics g) {
	
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    
    Font miFuente = new Font("Times New Roman", Font.BOLD, 26);
    
    g2.setFont(miFuente);
    g2.setColor(Color.CYAN.brighter().brighter());
    g2.drawString("IKER", 100, 100);
    
    g2.setFont(new Font("Arial", Font.ITALIC, 20));
    g2.setColor(new Color(128,90,50));
    g2.drawString("Prueba de diferentes fuentes", 100, 200);
    
    
    
    
    
	}
	
}