package trapezioo;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

		int opcao;
		
		Scanner input = new Scanner(System.in);
		double n1, n2, divisao, raio, area;
		
        do {
            System.out.println("Digite a op��o: ");
            System.out.println("1: Divis�o");
            System.out.println("2: �rea do C�rculo");
            System.out.println("3: M�dia de 5 n�meros");
            System.out.println("4: Sair");

            opcao = input.nextInt();

            switch (opcao){
                    case 1:
                            System.out.println("Digite os n�meros: ");
                            n1 = input.nextDouble();
                            n2 = input.nextDouble();
                            divisao = n1/n2;
                            System.out.println("Resultado da divis�o: " + divisao);
                            break;
                    case 2:
                            System.out.println("Digite o raio: ");
                            raio = input.nextDouble();
                            area = Math.PI * Math.pow(raio, 3);
                            System.out.format("�rea do c�rculo: %.2f\n", area);
                            break;
                    case 3:
                        System.out.println("Digite os 5 n�meros: ");
                        double numeros[] = new double[5];
                        double soma = 0;
                        for (int i = 0; i < 5; i++)
                        {
                            numeros[i] =  input.nextDouble();
                            soma = soma + numeros[i];
                        
                        System.out.println("M�dia: " + soma/5);
                        
                        }
                        break;
                        
                    case 4:
                            System.out.println("Fim do programa!");
                            break;
                    default:
                            System.out.println("Op��o inv�lida!");
                            
           	}
        } while (opcao <= 4);
	}

}