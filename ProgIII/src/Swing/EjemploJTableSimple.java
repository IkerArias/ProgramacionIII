package Swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class EjemploJTableSimple implements TableModel {

    // Datos de prueba
    Object datosTabla[][] = {
            {"Unai Simon", 1, "Portero", "Alava"},
            {"Yeray Alvarez", 5, "Defensa", "Bizkaia"},
            {"Yuri Berchiche", 17, "Lateral", "Giupzcoa"},
            {"Oihan Sancet", 8, "Mediapunta", "Navarra"},
            {"Iñaki Williams", 9, "Extremo", "Ghana"},
            {"Nico Williams", 11, "Extremo", "Navarra"},
    };
    String columnas[] = {"Nombre", "Dorsal", "Posicion", "Provincia"};
    Class tipos[] = {String.class, Integer.class, String.class, String.class};

    private static JTable tPrueba;
    private static EjemploJTableSimple modelo;

    // Método principal
    public static void main(String[] args) {
        modelo = new EjemploJTableSimple(); // Inicializar el modelo
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setTitle("Plantilla Athletic Club");
        f.setSize(600, 800);
        f.setLocationRelativeTo(null);
        tPrueba = new JTable();
        tPrueba.setModel(modelo);
        f.getContentPane().add(new JScrollPane(tPrueba), BorderLayout.CENTER);
        f.setVisible(true);
    }

    @Override
    public int getRowCount() {
        return datosTabla.length;
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipos[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datosTabla[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
}
