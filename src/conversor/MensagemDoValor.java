package conversor;

import javax.swing.JOptionPane;

public class MensagemDoValor {

	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "Mensagem",
//				  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
		double valor = 257.75;
		
		JOptionPane.showMessageDialog(null,"O valor da conversão é de R$ " + valor);
	}

}
