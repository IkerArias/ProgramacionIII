package Swing;

import javax.swing.JFrame;

public class SwingI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiVentana v = new MiVentana();
		v.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		v.setVisible(true);
		
	}
	
	

}

class MiVentana extends JFrame {
	
	public MiVentana() {
		
		setSize(600,800);
		setLocationRelativeTo(null); //Centrar la ventana
		setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH); //Para maximizar al iniciar
		setTitle("Mi Ventana de Prueba");
		
	}
	
}
