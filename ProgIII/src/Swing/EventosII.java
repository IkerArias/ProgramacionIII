package Swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaEventoVentana v = new VentanaEventoVentana();
		v.setVisible(true);
		VentanaEventoVentana v2 = new VentanaEventoVentana();
		v2.setVisible(true);
	}

}

class VentanaEventoVentana extends JFrame {
	
	public VentanaEventoVentana() {
	
	setTitle("Ventana con eventos de ventana");
    setSize(600, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    LaminaAcciones l = new LaminaAcciones();
    addWindowListener(l);
    
    
	}
	
}

class LaminaAcciones implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Abriendo ventana");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrando ventana");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana cerrada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana restaurada");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana desactivada");
		
	}
	
	
	
	
}
