package exercicios10;

	import java.util.Scanner;
    import java.math.*;
	public class exercicio4 {

	 public static void main (String[] args){
		 
		 System.out.println("vou adivinhar seu nome e sua idade");
			 
			  Scanner s = new Scanner (System.in);
	 
			  String nome;
			  Integer idade;
			  
			  
			  System.out.println ("Escreva Seu Nome :");
			   nome = s.next ();
			 
			   System.out.println ("E seu ano de nascimento:");
			   idade  = s.nextInt ();

			   System.out.println("Seu Nome É:" + nome );
			 
			   System.out.println("Sua idade É:"  + (2023-idade));
	 }
	 }
	 