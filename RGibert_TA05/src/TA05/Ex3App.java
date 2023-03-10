package TA05;
import javax.swing.JOptionPane;

public class Ex3App {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
	}

}
