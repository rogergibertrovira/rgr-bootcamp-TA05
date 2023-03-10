package TA05;
import javax.swing.JOptionPane;

public class Ex4App {

	public static void main(String[] args) {
		final double PI = 3.14;
		
		String radioS = JOptionPane.showInputDialog(null, "Introduce el radio");
		double radio = Double.parseDouble(radioS);
		
		double areaCirculo = PI * Math.pow(radio, radio);
		
		JOptionPane.showMessageDialog(null, "El area del circulo es: "+areaCirculo);
	}

}
