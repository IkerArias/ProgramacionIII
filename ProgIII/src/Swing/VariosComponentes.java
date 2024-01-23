package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VariosComponentes extends JFrame {

    private static final long serialVersionUID = 1L;
    private ButtonGroup bgRadios; // Grupo de los RadioButtons
    private JRadioButton rbAthletic;
    private JRadioButton rbBarcelona;
    private JRadioButton rbGirona;
    private JRadioButton rbRealSociedad;
    private JRadioButton rbMadrid;
    private JRadioButton rbAtletico;
    private JCheckBox cbNinguno;
    private JTextArea taArea; // TextArea
    private JScrollPane spCentral; // ScrollPane central
    private JSpinner spinGoles; // Spinner
    private JTextField tfValor;
    private JTextField tfValor2;
    private JSlider slPuntos;
    private JProgressBar pbProgreso; // ProgressBar
    private JButton btnProgreso;

    public VariosComponentes() {

        // Inicializar la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Centra la posición en el escritorio
        setTitle("LaLiga 2023-2024");

        // Inicializacion de componentes y contenedores
        // Paneles y Layouts
        JPanel pnlBotonera = new JPanel();
        pnlBotonera.setLayout(new BoxLayout(pnlBotonera, BoxLayout.Y_AXIS));
        JPanel pnlInferior = new JPanel();
        // Botones de radioButton y ButtonGroup
        rbAthletic = new JRadioButton("Athletic Club de Bilbao");
        rbBarcelona = new JRadioButton("FC Barcelona");
        rbGirona = new JRadioButton("Girona");
        rbRealSociedad = new JRadioButton("Real Sociedad");
        rbMadrid = new JRadioButton("Real Madrid");
        rbAtletico = new JRadioButton("Atletico de Madrid");
        bgRadios = new ButtonGroup(); // Initialize ButtonGroup
        bgRadios.add(rbAthletic);
        bgRadios.add(rbAtletico);
        bgRadios.add(rbBarcelona);
        bgRadios.add(rbGirona);
        bgRadios.add(rbMadrid);
        bgRadios.add(rbRealSociedad);
        // CheckBox
        cbNinguno = new JCheckBox("Ninguno de los anteriores");
        // Resto de componentes
        taArea = new JTextArea(15, 40);
        spCentral = new JScrollPane(taArea);
        slPuntos = new JSlider(50, 120);
        tfValor = new JTextField("0", 5);
        tfValor2 = new JTextField("0", 5);
        pbProgreso = new JProgressBar(0, 100);
        btnProgreso = new JButton("Progreso");
        spinGoles = new JSpinner();
        // Formato y configuracion
        pnlBotonera.setBorder(BorderFactory.createDashedBorder(Color.red, 10.0f, 5.0f));
        spinGoles.setPreferredSize(new Dimension(60, 20));
        taArea.append("Bienvenido a los pronosticos de LaLiga 2023-2024\n");
        taArea.append("Indica en el Spinner cuantos goles metera el equipo ganador\n");
        taArea.append("Indica en el Slider con cuantos puntos Ganara\n");
        taArea.append("Por ultimo pulsa en el boton progreso para Guardar cambios\n");
        // Asociacion de componenetes a contenedores
        pnlBotonera.add(new JLabel("Equipo ganador de LaLiga 2023-24:"));
        pnlBotonera.add(rbMadrid);
        pnlBotonera.add(rbBarcelona);
        pnlBotonera.add(rbGirona);
        pnlBotonera.add(rbAtletico);
        pnlBotonera.add(rbAthletic);
        pnlBotonera.add(rbRealSociedad);
        pnlBotonera.add(cbNinguno);
        pnlInferior.add(spinGoles);
        pnlInferior.add(slPuntos);
        pnlInferior.add(tfValor);
        pnlInferior.add(tfValor2);
        pnlInferior.add(btnProgreso);
        pnlInferior.add(pbProgreso);
        getContentPane().add(pnlBotonera, BorderLayout.WEST);
        getContentPane().add(spCentral, BorderLayout.CENTER);
        getContentPane().add(pnlInferior, BorderLayout.SOUTH);
        // Menus
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu1 = new JMenu("Acciones");
        JMenuItem menuItem1 = new JMenuItem("Reseteo");
        menu1.add(menuItem1);
        barraMenu.add(menu1);
        JMenu menu2 = new JMenu("Otras");
        JMenuItem menuItem2 = new JMenuItem("Salir");
        menu2.add(menuItem2);
        barraMenu.add(menu2);
        setJMenuBar(barraMenu);
        // Eventos
        spinGoles.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                tfValor.setText(spinGoles.getValue() + "");
            }
        });
        slPuntos.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                tfValor2.setText(slPuntos.getValue() + "");
            }
        });
        btnProgreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taArea.append("Guardando pronosticos...\n");
                // Simular guardado
                for (int i = 0; i < 100; i++) {
                    pbProgreso.setValue(i);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e1) {
                    }
                }
            }
        });
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bgRadios.clearSelection();
                pbProgreso.setValue(0);
                taArea.setText("");
            }
        });
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }

    // MetodoPrincipal
    public static void main(String[] args) {
        VariosComponentes f = new VariosComponentes();
        f.setVisible(true);

    }

}
