package entidades;

public class Livro extends Produto {
	private autor String;

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String a) {
		this.autor = a;
	}
}