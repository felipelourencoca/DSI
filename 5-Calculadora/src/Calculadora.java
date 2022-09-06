//Com estado, clássica
public class Calculadora {
	private float n1;
	private float n2;
	
	public Calculadora() {
	}	
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public void setN2(float n2) {
		this.n2= n2;
	}
	
	public float somar() {
		return this.n1 + this.n2;
	}

}
