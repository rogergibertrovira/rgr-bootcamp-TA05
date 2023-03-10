package TA05;

import javax.swing.JOptionPane;

public class Ex5App {
	public static void main(String[] args) {
		String numeroS = JOptionPane.showInputDialog(null, "Introduce un numero");
		double numero = Double.parseDouble(numeroS);
		
		if(numero%2 != 0) {
			JOptionPane.showMessageDialog(null, numero+" no es divisible entre 2");
		}
		else {
			JOptionPane.showMessageDialog(null, numero+" es divisible entre 2");
		}
	}
}
