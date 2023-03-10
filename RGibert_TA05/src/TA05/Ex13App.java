package TA05;

import javax.swing.JOptionPane;

public class Ex13App {

	public static void main(String[] args) {
		String aStr = JOptionPane.showInputDialog(null, "Introduce operando 1");
		int a = Integer.parseInt(aStr);
		
		String bStr = JOptionPane.showInputDialog(null, "Introduce operando 2");
		int b = Integer.parseInt(bStr);

		String signo = JOptionPane.showInputDialog(null, "Introduce operacion");
		
		double resultado = 0.0;
		
		switch(signo) {
			case "+":
				resultado = a+b;
				break;
			case "-":
				resultado = a-b;
				break;
			case "*":
				resultado = a*b;
				break;
			case "/":
				resultado = a/b;
				break;
			case "^":
				resultado = Math.pow(a, b);
				break;
			case "%":
				resultado = a%b;
				break;
		}
		
		JOptionPane.showMessageDialog(null, "El resultado de "+a+" "+signo+" "+b+ " = "+ resultado);
	}

}
