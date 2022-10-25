
public class Yanchia extends Heroi {

	public Yanchia(float pontosVida, float forca) {
		super(pontosVida, forca);
		// TODO Auto-generated constructor stub
	}
	
	public float morrer(Heroi h) {
		 this.pontosVida =- 100;
		 return h.getPontosVida();
	}
	
	/*
	public float atacar(Heroi h) {
		if(h.getPontosVida() > 0) {
			h.setPontosVida(h.getPontosVida() - this.forca);
			return h.getPontosVida();
		}
		return 0.0f;
	}
	*/
}
