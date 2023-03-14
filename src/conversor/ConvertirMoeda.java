package conversor;

import javax.swing.JOptionPane;

public class ConvertirMoeda {

	public static void main(String[] args) {
		
		Moeda moeda = new Moeda();
		Moeda moedaConvertida = new Moeda();
		
		String moedaAConvertir = (JOptionPane.showInputDialog(null,"Escolha a moeda para a qual " + 
			    "você deseja girar seu dinheiro",
				"MOEDAS", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De Reais a Dólares", "De Reais a Euros", 
					"De Reais a Libras", "De Reais a Yenes", "De Reais a Won Coreano",
					"De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", 
					"De Yenes a Reais", "De Won Coreano a Reais"},"Conversor de Moeda")).toString();
		
		System.out.println("Se va a convertir: " + moedaAConvertir );
		
		switch (moedaAConvertir) {
		case "De Reais a Dólares": {
			System.out.println("Entrou ao case " + moedaAConvertir);
			System.out.println("ok-option = " + JOptionPane.OK_OPTION);
			moeda.setNome("Real");
			moeda.setSimbolo("$");
			moedaConvertida.setNome("Dolar");
			moedaConvertida.setSimbolo("US$");
			
			break;
		}
		case "De Reais a Euros": {
			System.out.println("Entrou ao case " + moedaAConvertir);
			System.out.println("ok-option = " + JOptionPane.OK_OPTION);
			break;
		}
		case "De Reais a Libras": {
			System.out.println("Entrou ao case " + moedaAConvertir);
			System.out.println("ok-option = " + JOptionPane.OK_OPTION);
			break;
		}
			
		}
		
		double numero=Double.parseDouble(JOptionPane.showInputDialog("Insira um" +
				  " valor a convertir"));
		
	}
}
