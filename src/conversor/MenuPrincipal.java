package conversor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Main Window");	
		
		String opcao = (JOptionPane.showInputDialog(null,"Selecione uma opção",
				"MENU", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"Conversor de Moeda", "Conversor de Temperatura",
				"Conversor de Medição" },"Conversor de Moeda")).toString();
		
		if (opcao == "Conversor de Moeda") {
			System.out.println("A opção é: " + opcao);
			
			Moeda moeda = new Moeda();
			
			
			
			
			
		}
	}
	
}
