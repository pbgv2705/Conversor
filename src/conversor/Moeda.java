package conversor;

public class Moeda extends UnidadeAMedir implements Calculavel {

//	public double convertirMoeda(String moeda, double valor){
//		return 0;
//	}
	private double valor;
	public Moeda() {
		
	}
	public Moeda(String nome, String tipo, String simbolo) {
		super(nome, tipo, simbolo);
	}
	
	
	@Override
	public double getCalculo() {
		// Agregar caixa de dialogo para pedir ?????
		return 0;
	}
	
	

}
