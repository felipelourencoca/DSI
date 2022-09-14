
public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.setN1(10);
		c.setN2(10);
		
		System.out.println(c.somar());
		c.setN1(30);
		c.setN2(30);
		System.out.println(c.somar());
		
		
		Calculadora2 c2 = new Calculadora2();
		
		float resultado = c2.somar(5, 5);
		System.out.println(c2.somar(4, resultado));

	}

}
