
public class Main {
	public static void main(String[] args) {
		Gato g = new Gato("Shiro","vira-lata",10);
		Cachorro c = new Cachorro("tody","labrador");
		
		c.latir();
		g.miar();
	
		
		// Não pode ser instanciada
		//,pois é abstrata; uma definição.
		//Animal a = new Animal("Animal","vira-lata");
		
		/*coercoes de tipos
		Animal a = (Animal) new Gato("foo","bar",30);
	
		Gato g  = new Animal("foo","bar");

		//int valor = (int)3.4;
		//double valor2 = 3;
		*/
		//Gato g  = new Animal("foo","bar");
		Animal a = (Animal) new Gato("foo","bar",30);
		
		
		
		
		
	}
}
