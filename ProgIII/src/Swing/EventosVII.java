package Swing;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class EventosVII {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaEventoFoco v = new VentanaEventoFoco();
		v.setVisible(true);
	}

}

class VentanaEventoFoco extends JFrame {
	
	public VentanaEventoFoco() {
	
	setTitle("Ventana con eventos de foco");
    setSize(600, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    LaminaFoco f = new LaminaFoco();
    add(f);
    

	}
	
}

class LaminaFoco extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);	
		
		txt1 = new JTextField();
		
		txt1.setBounds(120,10,150,20);
		
		add(txt1);
		
		LanzaFoco f = new LanzaFoco();
		txt1.addFocusListener(f);
		
		

	}
	
	JTextField txt1;
	
	
	
}

class LanzaFoco implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Foco ganado"); 
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Foco perdido");
		
		String email = txt1.getText();
		boolean comprobacion = false;
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i) == '@') {
				
				comprobacion = true;
			}
		}
		
		if(comprobacion) {
			System.out.println("El email es correcto");
		}
		
	}
	
	JTextField txt1;
	
	
	
}