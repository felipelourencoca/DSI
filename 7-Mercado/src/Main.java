import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(15);
		numeros.add(30);
		int x = new Integer(30);
		Integer y = x;
		Integer z  = new Integer(10);
		System.out.println(numeros);
		
		numeros.add(z);
		System.out.println(numeros);
		*/
		/*
		String time = "Palmeiras";
		String titulo = "Palmeiras";
		
		System.out.println(time.equals(titulo));
		System.out.println(time == titulo);
		System.out.println(time);
		System.out.println(new Produto("f",22));
		*/
		
		Produto p = new Produto("Sabonete em pó", 10.99f);
		Produto p2 = new Produto("Nescau", 5);
		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(p);
		carrinho.adicionarProduto(p2);
		carrinho.listarProdutos();
		
		//System.out.println(carrinho);
		carrinho.removerProduto(p2);
		carrinho.listarProdutos();
		
		
		
	}
}
