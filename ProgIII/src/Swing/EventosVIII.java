package Swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class EventosVIII extends JFrame implements WindowFocusListener {

    public static void main(String[] args) {
        EventosVIII v = new EventosVIII();
        v.Iniciar();
    }

    public void Iniciar() {
        marco1 = new EventosVIII();
        marco2 = new EventosVIII();

        marco1.setVisible(true);
        marco2.setVisible(true);

        marco1.setBounds(300, 100, 600, 350);
        marco2.setBounds(1200, 100, 600, 350);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == marco1) {
            marco1.setTitle("Tengo el foco");
            marco2.setTitle("Perdí el foco");
        } else if (e.getSource() == marco2) {
            marco1.setTitle("Perdí el foco");
            marco2.setTitle("Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        // You can implement this method if needed
    }

    EventosVIII marco1;
    EventosVIII marco2;
}


