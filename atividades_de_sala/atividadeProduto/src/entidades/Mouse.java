package entidades;

public class Mouse extends Produto {
	private String tipo;



	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getNomeLoja() {
		return this.nomeLoja;
	}

	public void setNomeLoja(String nl) {
		this.nomeLoja = nl;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double p) {
		this.preco = p;
	}
}