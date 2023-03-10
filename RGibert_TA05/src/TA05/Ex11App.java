package TA05;

import javax.swing.JOptionPane;

public class Ex11App {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog(null, "Introduce un dia de la semana");
		
		switch(dia){
			case "Lunes":
				JOptionPane.showMessageDialog(null, "El "+dia+ " es laboral");
				break;
			case "Martes":
				JOptionPane.showMessageDialog(null, "El "+dia+ " es laboral");
				break;
			case "Miercoles":
				JOptionPane.showMessageDialog(null, "El "+dia+ " es laboral");
				break;
			case "Jueves":
				JOptionPane.showMessageDialog(null, "El "+dia+ " es laboral");
				break;
			case "Viernes":
				JOptionPane.showMessageDialog(null, "El "+dia+ " es laboral");
				break;
			case "Sabado":
				JOptionPane.showMessageDialog(null, "El "+dia+ " no es laboral");	
				break;
			case "Domingo":
				JOptionPane.showMessageDialog(null, "El "+dia+ " no es laboral");	
				break;
		}
	}
}
