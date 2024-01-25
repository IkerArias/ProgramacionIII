package Swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EentosI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VentanaBotones v = new VentanaBotones();
		v.setVisible(true);
		
	}

}

class VentanaBotones extends JFrame {
	
	public VentanaBotones() {
	
	setTitle("Ventana con Botones para Eventos");
    setSize(600, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    LaminaBotones l = new LaminaBotones();
    add(l);
    
    
	}
	
}


class LaminaBotones extends JPanel implements ActionListener {
	
	JButton btnAzul = new JButton("Cambiar el color del fondo a cyan");
	JButton btnRojo = new JButton("Cambiar el color del fondo a rojo");
	JButton btnAmarillo = new JButton("Cambiar el color del fondo a amarillo");
	
	public LaminaBotones() {
		
		add(btnAzul);
		add(btnRojo);
		add(btnAmarillo);
		
		btnAzul.addActionListener(this);
		btnRojo.addActionListener(this);
		btnAmarillo.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botonPulsado = e.getSource();
		
		if (botonPulsado == btnAzul) {
			setBackground(Color.CYAN.brighter().brighter());
		} else if (botonPulsado == btnRojo) {
			setBackground(Color.RED.brighter().brighter());
		} else {
			setBackground(Color.YELLOW.brighter().brighter());
		}
		
	}

}
	
	

