import java.util.Scanner;

public class Main {
       
	    public static void main(String[] args) {
			//Estruturas de controle
	    	//Decisão, Repetição.
	    	
	        //Scanner s = new Scanner(System.in);
	    	/*
	        int idade  = 10 ;
	        
	        if(idade <= 12){
	        	System.out.println("Jovem");
	        }else if ( idade <= 17){
	        	   System.out.println("Adolescente");
	        }else {
	        	System.out.println("Adulto");
	        }
	        */
	    	
	    	int opc = 0;
	    	/*
	    	do {
	    		System.out.println(opc);
	    		 opc = opc + 1;
	    	}while(opc < 10);
	    	
	    	opc = 0;
	    	while(opc < 10){
	    		opc ++; 
	    		System.out.println(opc);
	    	}
	   */
	    	
	    	/*
	    	for(int i = 0, j = 10; i < 10 && j > 0; i++ , j-- ) {
	    		System.out.println(i + " " + j);
	    	}
	    	*/
	    	/* vetores
	    	int []numeros = new int[10];//vetor estático 	
	    	for(int i = 0; i < 10 ; i++ ) {
	    		numeros[i] = i +1;
	    		//System.out.println(i);
	    	}
	    	
	    	for(int i = 0; i < 10 ; i++ ) {
	    		System.out.println(numeros[i]);
	    		;
	    	}
	    	
	    	System.out.println(numeros);
	    
	        
	   */
	    	
	    	// Matriz
	    	Scanner s  = new Scanner(System.in);
	    	
	    	int linha = s.nextInt();
	    	int coluna = s.nextInt();
	    	
	    	int [][]mat = new int[linha][coluna];
	
	    	
	    	for(int i = 0; i < linha; i ++) {
	    		for(int j = 0; j < coluna; j ++) {
	    			mat[i][j] =  10 * i * j;
	    		}
	    	}		    	
	    	for(int i = 0; i < 2; i ++) {
	    		for(int j = 0; j < 2; j ++) {
	    			System.out.print(mat[i][j] + " ");
	    		}
	    		System.out.println();
	    	}
	    	
	    	
	    	
		}
}
