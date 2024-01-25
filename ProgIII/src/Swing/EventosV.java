package Swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventosV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaEventoRaton v = new VentanaEventoRaton();
		v.setVisible(true);
	}

}

class VentanaEventoRaton extends JFrame {
	
	public VentanaEventoRaton() {
	
	setTitle("Ventana con eventos de teclado");
    setSize(600, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    EventoDeRaton er = new EventoDeRaton();
    addMouseListener(er);

	}
	
}

class EventoDeRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Raton presionado");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has dejado de presionar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has entrado");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has salido");
	}
	
	
}