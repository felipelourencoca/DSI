
public class Main {
	
	public static void main(String[] args) {
		
		Heroi heroi1 = new  Goku(50, 10);
		Heroi heroi2 = new Yanchia(40,20);
		Heroi heroi3 = new Saitama(10000,2000000);
		
		heroi1.atacar(heroi3);
		heroi1 = new Yanchia(10, 10);
		//heroi1.kamehameha(heroi3);
		//heroi3.socoSimples(heroi1);
		
		
		//System.out.println(heroi3.getPontosVida());
		//System.out.println(heroi1.getPontosVida());
	}

}
