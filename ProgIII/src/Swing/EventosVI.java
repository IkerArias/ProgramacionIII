package Swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class EventosVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaEventoRaton2 v = new VentanaEventoRaton2();
		v.setVisible(true);
	}

}

class VentanaEventoRaton2 extends JFrame {
	
	public VentanaEventoRaton2() {
	
	setTitle("Ventana con eventos de teclado");
    setSize(600, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    EventosDeRaton er = new EventosDeRaton();
    addMouseListener(er);
    
    
    

	}
	
}

class EventosDeRaton extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Coordenada X:" + e.getX() + "Coordenada Y:" + e.getY());
		System.out.println(e.getClickCount());
		
	}
	
	public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el boton izquierdo");
		} else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del boton");
		} else {
			System.out.println("Has pulsado el boton derecho");
		}
	}
	
	
}

