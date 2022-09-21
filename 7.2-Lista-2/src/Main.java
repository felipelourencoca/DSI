import java.util.Scanner;

class Main {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {	
				
		System.out.println(somaValoresVetores(populaVetor(tamanhoVetor())));
		
	}	
	//Questão de prova.	
	public static int[] populaVetor(int tamanho) {
		
		int []vetor = new int[tamanho];
		for(int i =0; i < tamanho;  i ++) {			
			int valorUsuario = s.nextInt();
			vetor[i] = valorUsuario;
		}
		return vetor;
	}	
	public static int tamanhoVetor() {
		int tamanho  = s.nextInt();	
		return tamanho;
	}	
	public static int somaValoresVetores(int [] vet ) {
		int total = 0;
		for(int i =0; i < vet.length;  i ++) {
			
			total += vet[i];
		}
		return total;
	}

}
