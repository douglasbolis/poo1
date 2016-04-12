package entidades;

public class Produto {
	private nome String;
	private preco Double;
	private descricao String;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double p) {
		this.preco = p;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String d) {
		this.descricao = d;
	}
}