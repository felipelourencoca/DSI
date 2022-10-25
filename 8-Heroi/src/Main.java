
public class Main {
	
	public static void main(String[] args) {
		
		Goku heroi1 = new Goku(50, 10);
		Yanchia heroi2 = new Yanchia(40,20);
		Saitama heroi3 = new Saitama(10000,2000000);
		
		heroi1.kamehameha(heroi3);
		heroi3.socoSimples(heroi1);
		
		
		System.out.println(heroi3.getPontosVida());
		System.out.println(heroi1.getPontosVida());
	}

}
