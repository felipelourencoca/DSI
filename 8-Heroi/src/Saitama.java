
public class Saitama extends Heroi {
	
	public Saitama(float pontosVida, float forca) {
		super(pontosVida, forca);
		// TODO Auto-generated constructor stub
	}

	public float socoSimples(Heroi h) {
		if(h.getPontosVida() > 0) {
			h.setPontosVida(h.getPontosVida() - this.forca);
			return h.getPontosVida();
		}
		
		return h.getPontosVida();
	}

	@Override
	public float atacar(Heroi h) {
		if(h.getPontosVida() > 0) {
			h.setPontosVida(h.getPontosVida() - 100000);
			return h.getPontosVida();
		}
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
