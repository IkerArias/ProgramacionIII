package Swing;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventosIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaEventoVentana2 v = new VentanaEventoVentana2();
		v.setVisible(true);

	}

}

class VentanaEventoVentana2 extends JFrame {
	
	public VentanaEventoVentana2() {
	
	setTitle("Ventana con eventos de ventana");
    setSize(600, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    cambiaEstado c = new cambiaEstado();
    addWindowStateListener(c);
    
    
	}
	
}

class cambiaEstado implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado de estado");
		System.out.println(e.getNewState());
		
		if(e.getNewState()== Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana esta en pantalla completa");
		}
		
		if(e.getNewState()== Frame.NORMAL) {
			System.out.println("La ventana esta normal");
		}
		
		if(e.getNewState()== Frame.ICONIFIED) {
			System.out.println("La ventana esta minimizada");
		}
		
		
	}
	
}
