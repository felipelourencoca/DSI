import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Chamada {
	private Date data;
	private Integer duracao;
	
	public Chamada(Date data, Integer duracao) {
		super();
		this.data = data;
		this.duracao = duracao;
	}

	public Date getData() {
		return data;
	}

	public Integer getDuracao() {
		return duracao;
	}

	@Override
	public String toString() {
		return "Chamada [data=" + data + ", duracao=" + duracao + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(data, duracao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamada other = (Chamada) obj;
		return Objects.equals(data, other.data) && Objects.equals(duracao, other.duracao);
	}

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(1999,01,01);		
		Date d = ca.getTime();
		Chamada c = new Chamada(d, 50);
		Chamada c2 = new Chamada(d, 50);
		
		
		
		List<Chamada> chamadas = new ArrayList<>();
		chamadas.add(c);
		chamadas.add(c);

		Set cm = new HashSet();
		
		cm.add(c);
		cm.add(c);
		
		System.out.println(cm);
		System.out.println();
		System.out.println(chamadas);
		//System.out.println(c);
		
	
		
	}
	
}
