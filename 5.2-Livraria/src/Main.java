
public class Main {

	public static void main(String[] args) {
		Livro l = new Livro("O capital");
		
		Autor a = new Autor(l);
		
		System.out.println(a.getLivro().getNome());
		

	}

}
