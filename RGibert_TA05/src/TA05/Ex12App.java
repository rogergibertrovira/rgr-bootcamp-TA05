package TA05;

import javax.swing.JOptionPane;

public class Ex12App {

	public static void main(String[] args) {
		final String CONTRASEÑA = "contra1234"; 
				
		int intentos = 3;
		boolean contraseñaCorrecta = false;
		
		while(intentos > 0 && !contraseñaCorrecta) {
			String contraseñaEntrada = JOptionPane.showInputDialog(null, "Introduce la contraseña");
			
			contraseñaCorrecta = contraseñaEntrada.equals(CONTRASEÑA);
						
			intentos--;
		}
		
		if(contraseñaCorrecta) {
			JOptionPane.showMessageDialog(null, "Enhorabuena!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Fallaste tres veces la contraseña");
		}

	}

}
