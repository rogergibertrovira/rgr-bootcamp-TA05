package TA05;

import javax.swing.JOptionPane;

public class Ex6App {

	public static void main(String[] args) {
		final double IVA = 0.21;
		
		String precioS = JOptionPane.showInputDialog(null, "Introduce el precio del producto");
		double precio = Double.parseDouble(precioS);
		
		double precioFinal = precio + precio*IVA;
		
		JOptionPane.showMessageDialog(null, "El precio final es: "+precioFinal);

	}

}
