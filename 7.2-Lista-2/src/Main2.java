import java.util.Scanner;

public class Main2 {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
	 System.out.println(menorValor(populaVetor(tamanhoVetor()) ));
		
	}
	
public static int[] populaVetor(int tamanho) {
		
		int []vetor = new int[tamanho];
		for(int i =0; i < tamanho;  i ++) {			
			vetor[i] = (int) (Math.random() * 100);
			System.out.println(vetor[i]);
		}
	
		return vetor;
		
	}	
	public static int tamanhoVetor() {
		int tamanho  = s.nextInt();	
		return tamanho;
	}	
	public static int menorValor(int [] vet ) {
		int menor = vet[0];		
		for(int i =0; i < vet.length;  i ++) {
			if(vet[i] < menor) {
				menor = vet[i];
			}
		}
		return menor;
	}

}
