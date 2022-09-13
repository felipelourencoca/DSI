
public class Gato extends Animal{
	private int tamanhoCalda;
	
	public Gato(String nome, String raca,int tamanhoCalda ) {
		super(nome,raca);
		this.tamanhoCalda = tamanhoCalda;

	}
	
	public void miar() {
		System.out.println("Miauuu");
	}
	
}
