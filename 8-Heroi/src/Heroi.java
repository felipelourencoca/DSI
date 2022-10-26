
public abstract class Heroi {
	protected float pontosVida;
	protected float forca;
	
	public Heroi(float pontosVida, float forca) {
		super();
		this.pontosVida = pontosVida;
		this.forca = forca;
	}
	
	public abstract float atacar(Heroi h);
		



	public float getPontosVida() {
		return pontosVida;
	}


	public float getForca() {
		return forca;
	}


	public void setPontosVida(float pontosVida) {
		this.pontosVida = pontosVida;
	}


	public void setForca(float forca) {
		this.forca = forca;
	}
	
	

	
}
