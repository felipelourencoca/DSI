import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Produto> produtos;
	
	public Carrinho() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionarProduto(Produto p) {
		this.produtos.add(p);
	}
	
	public void listarProdutos() {
		int i =0;
		while(i < this.produtos.size()) {
			System.out.println(produtos.get(i).getNome());
			i++;
		}
	}
	
	
	public void removerProduto(Produto p) {
		
		for(int i = 0; i < produtos.size(); i++ ) {
			if(produtos.get(i).getNome() == p.getNome() ){
				this.produtos.remove(i);
			};
		}
	}
	
}
