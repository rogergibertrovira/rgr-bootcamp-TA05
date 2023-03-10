package TA05;

import javax.swing.JOptionPane;

public class Ex10App {

	public static void main(String[] args) {
		String ventasS = JOptionPane.showInputDialog(null, "Introduce el numero de ventas");
		int ventas = Integer.parseInt(ventasS);

		double sumaVentas = 0.0;

		for (int i = 0; i < ventas; i++) {
			String valorVentaS = JOptionPane.showInputDialog(null, "Introduce el valor de la venta");
			int valorVenta = Integer.parseInt(valorVentaS);

			sumaVentas += valorVenta;
		}
		JOptionPane.showMessageDialog(null, "El valor total de las ventas es: " + sumaVentas);
	}
}
