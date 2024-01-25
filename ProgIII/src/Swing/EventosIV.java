package Swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaEventoTeclado v = new VentanaEventoTeclado();
		v.setVisible(true);
	}

}

class VentanaEventoTeclado extends JFrame {
	
	public VentanaEventoTeclado() {
	
	setTitle("Ventana con eventos de teclado");
    setSize(600, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    EventoDeTeclado et = new EventoDeTeclado();
    addKeyListener(et);

	}
	
}

class EventoDeTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra = e.getKeyChar();
		System.out.println(letra);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
