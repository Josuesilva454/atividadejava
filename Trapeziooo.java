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
		System.out.print("Informe a altura do trap�zio: ");
	    altura = input.nextFloat();
	}
	 public void maiorNumero() {   
	    System.out.print("Informe a base maior do trap�zio: ");
	    baseMaior = input.nextFloat();
	 }
	    public void menorNumero() {
	    System.out.print("Informe a base menor do trap�zio: ");
	    baseMenor = input.nextFloat();
	    } 
	    public void CalculoNumero() {
	    area = ((baseMaior+baseMenor)* altura)/2;
	    mE = (baseMaior-baseMenor)/2;
	    System.out.println("A area �: " + area);
	    System.out.println("A mediana de Euler �: " + mE);

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
	
	
		
	}
	
		
		
	
	
		
		
		
		
	


		
	


