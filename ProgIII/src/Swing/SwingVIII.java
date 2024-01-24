package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingVIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaImagen v = new VentanaImagen();
		v.setVisible(true);
	}

}
class VentanaImagen extends JFrame {
	
	public VentanaImagen() {
		
		setTitle("Ventana con Imagen");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		
        LaminaImagen l = new LaminaImagen();
        add(l);
        
		
	}
}

class LaminaImagen extends JPanel {
	
	
	public void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    
    File miImagen = new File("/Users/ikerariasmartinez/git/repository/ProgIII/src/Swing/Icono.jpeg");

    try {
		imagen = ImageIO.read(miImagen);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("No se ha encontrado la imagen");
	}
    
    g.drawImage(imagen, 5, 5, null);

    
	}
	
	private Image imagen;
}