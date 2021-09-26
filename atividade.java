package trapezioo;

import java.util.Scanner;

public class jogador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int cont = 0;
	        int vetor1[] = new int[10];
	        int vetor2[] = new int[10];

	        Scanner input = new Scanner(System.in);

	        for (int i = 0; i < 10 ; i++) {
	            System.out.println("Informe um numero: ");
	            vetor1[i]   = input.nextInt();
	        }
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {

	                if (vetor1[i] == vetor2[j]) {
	                    cont++;
	                   
	            }
	                System.out.println("o numero e: " + vetor1[i] + vetor2[j] );         
	        }
	    }

	

	}

}
