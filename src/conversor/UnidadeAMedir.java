package conversor;

public class UnidadeAMedir {
	private String nome;
	private String tipo;
	private String simbolo;
	
	public UnidadeAMedir(String nome, String tipo, String simbolo) {
		this.nome = nome;
		this.tipo = tipo;
		this.simbolo = simbolo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSimbolo() {
		return this.simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	
	
}
