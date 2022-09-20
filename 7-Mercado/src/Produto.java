
public class Produto {
	private String nome;
	private float preco;
	
	public Produto(String nome, float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}	
}
