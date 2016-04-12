package entidades;

public class Livro extends Produto {
	private String autor;

	public Livro(String nl, String a, Double p) {
		this.nomeLoja = nl;
		this.autor = a;
		this.preco = p;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String a) {
		this.autor = a;
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