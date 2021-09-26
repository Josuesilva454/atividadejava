# atividadejava1)	Analise o código abaixo:

package trapezioo;
import java.util.Scanner;
public class Trapeziooo {

	private float altura ;
	private float baseMaior;
	private float baseMenor;
	private float mE;
	private float area;
	Scanner input = new Scanner(System.in);
	
	public void modularidade() {
		System.out.print("Informe a altura do trapézio: ");
	    altura = input.nextFloat();
	}
	 public void maiorNumero() {   
	    System.out.print("Informe a base maior do trapézio: ");
	    baseMaior = input.nextFloat();
	 }
	    public void menorNumero() {
	    System.out.print("Informe a base menor do trapézio: ");
	    baseMenor = input.nextFloat();
	    } 
	    public void CalculoNumero() {
	    area = ((baseMaior+baseMenor)* altura)/2;
	    mE = (baseMaior-baseMenor)/2;
	    System.out.println("A area é: " + area);
	    System.out.println("A mediana de Euler é: " + mE);

	}
	
	
	public float altura(){
		
		this.altura = altura;
		return altura;
	}	
	public float baseMaior() {
		this.baseMaior = baseMaior;
		return baseMaior;
	}
	public float baseMenor () {
    this.baseMenor = baseMenor;
    return baseMenor;
	}
	public float mE() {
	this.area = area;
	return area;
	}
	
	
		
	}package trapezioo;
public class calculo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Trapeziooo van = new Trapeziooo();
			van.modularidade();
			Trapeziooo van2 = new Trapeziooo();
			van2.maiorNumero();
			Trapeziooo van3 = new Trapeziooo();
			van.menorNumero();
			Trapeziooo van4 = new Trapeziooo();
			van.CalculoNumero();
			
	
		}
		}
		
a)	Como alterar o código de forma que fique atenda aos fatores de qualidade? Por exemplo: modularidade, reusabilidade….
Criar classe trapézio
declarar atributos
2)	Considere a seguinte especificação para o desenvolvimento de uma aplicação para cálculos matemáticos
●	Implementar um programa que será responsável por realizar um conjunto de cálculos matemáticos.
●	
●	O programa deverá exibir ao usuário um menu com as seguintes opções:
●	

Menu de Opções:

1: Divisão
2: Área de um Círculo
3: Média de 5 números
4: Sair


●	Ao selecionar a opção 1, o programa deverá solicitar ao usuário que informe os dois números para a divisão. Em seguida, deverá exibir o resultado da divisão do primeiro número pelo segundo. O cálculo da divisão é realizado pela equação: divisão = numero1/numero2
●	Ao selecionar a opção 2, o programa deverá solicitar ao usuário que informe o raio do círculo. Em seguida, deverá exibir o resultado do cálculo da área, de acordo com a seguinte fórmula: área = π * raio2
●	Ao selecionar a opção 3, o programa deverá solicitar ao usuário que informe 5 números reais. Em seguida, deverá exibir o resultado da média desses 5 números, de acordo com a seguinte fórmula: media = (numero1 + numero2 + numero3 + numero4 + numero5)/5 
●	Ao selecionar a opção 4, o programa deverá imprimir na tela a seguinte mensagem: FIM DO PROGRAMA!, e então o programa será encerrado.
●	O programa deverá executar enquanto o usuário não informar a opção 4.
●	Caso seja informada alguma outra opção diferente das opções 1, 2 ou 3, o programa deverá exibir a seguinte mensagem: Opção inválida!, e continuar sua execução.
●	 A seguir é exibido o código do programa implementado:









import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

		int opcao;
		
		Scanner input = new Scanner(System.in);
		double n1, n2, divisao, raio, area;
		
        do {
            System.out.println("Digite a opção: ");
            System.out.println("1: Divisão");
            System.out.println("2: Área do Círculo");
            System.out.println("3: Média de 5 números");
            System.out.println("4: Sair");

            opcao = input.nextInt();

            switch (opcao){
                    case 1:
                            System.out.println("Digite os números: ");
                            n1 = input.nextDouble();
                            n2 = input.nextDouble();
                            divisao = n1/n2;
                            System.out.println("Resultado da divisão: " + divisao);
                            break;
                    case 2:
                            System.out.println("Digite o raio: ");
                            raio = input.nextDouble();
                            area = Math.PI * Math.pow(raio, 3);
                            System.out.format("Área do círculo: %.2f\n", area);
                            break;
                    case 3:
                        System.out.println("Digite os 5 números: ");
                        double numeros[] = new double[5];
                        double soma = 0;
                        for (int i = 1; i <= 5; i++)
                        {
                            numeros[i] = input.nextDouble();
                            soma = soma + numeros[i];
                        }
                        System.out.println("Média: " + soma/5);
                        
                        break;
                    case 4:
                            System.out.println("Fim do programa!");
                    default:
                            System.out.println("Opção inválida!");
           	}
        } while (opcao <= 4);
	}

}

a)	Após analisar o código e executar o programa, descreva quais os defeitos, erros e falhas encontrados.


DEFEITO	ERRO	FALHA
Poluição visual ao encher a tela com as opções mesmo quando não necessário	Ele não sai do programa quando você digita a opção sair (4)

o usuário pode digitar algo que não seja um numero, e isso retorna um erro	Quando você coloca um numero que não está entre 1 e 4, o programa fecha


b)	Apresente o programa corrigido (não é preciso considerar a correção de entrada de dados para valores de tipos inválidos).

import java.util.Scanner;

public class Main
{
    static void showOpcoes(){
        System.out.println("Digite a opção: ");
        System.out.println("1: Divisão");
        System.out.println("2: Área do Círculo");
        System.out.println("3: Média de 5 números");
        System.out.println("4: Sair");
    } 
    
	public static void main(String[] args) {
		int opcao;
		showOpcoes();
		Scanner input = new Scanner(System.in);
		double n1, n2, divisao, raio, area;
		
        do {
            opcao = input.nextInt();

            switch (opcao){
                    case 1:
                            System.out.println("Digite os números: ");
                            n1 = input.nextDouble();
                            n2 = input.nextDouble();
                            divisao = n1/n2;
                            System.out.println("Resultado da divisão: " + divisao);
                            showOpcoes();
                            break;
                    case 2:
                            System.out.println("Digite o raio: ");
                            raio = input.nextDouble();
                            area = Math.PI * Math.pow(raio, 3);
                            System.out.format("Área do círculo: %.2f\n", area);
                            showOpcoes();
                            break;
                    case 3:
                        System.out.println("Digite os 5 números: ");
                        double numeros[] = new double[5];
                        double soma = 0;
                        for (int i = 1; i <= 5; i++)
                        {
                            numeros[i] = input.nextDouble();
                            soma = soma + numeros[i];
                        }
                        System.out.println("Média: " + soma/5);
                        showOpcoes();
                        
                        break;
                    case 4:
                            System.out.println("Fim do programa!");
                    default:
                            System.out.println("Opção inválida!");
           	}
        } while (opcao != 4);

	}
}

3)  Analise os códigos e descreva quais os defeitos, erros e falhas encontrados.

  int i=0;
  while (i < 10) {
  i++;
      System.out.println("Hello World\n"+i); 
  }





public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
	
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Informe um numero: ");
            vetor1[i] = input.nextInt();
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {

                if (vetor1[i] == vetor2[j]) {
                    cont++;
                }
            }
        }
    }

}

DEFEITO	ERRO	FALHA
1 código
Vai ficar em loop infinito	1 código
overflow de memória

2 código
Index 10 out ot bounds for length 10	2 código
Como o vetor 2 não consta preenchido, a condição nunca vai ser verdadeira

		

