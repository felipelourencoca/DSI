
public class Goku extends Heroi {

		
	public Goku(float pontosVida, float forca) {
		super(pontosVida, forca);
		// TODO Auto-generated constructor stub
	}
	
	

	public float kamehameha(Heroi h) {
		if(h.getPontosVida() > 0){
			h.setPontosVida(h.getPontosVida() - this.forca);
			return h.getPontosVida();
		}
		return h.getPontosVida();
	}



	@Override
	public float atacar(Heroi h) {
		if(h.getPontosVida() > 0) {
			h.setPontosVida(h.getPontosVida() - 1000);
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
