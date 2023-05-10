package exercicios10;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] angs){

		Scanner s = new Scanner (System.in);

		  double idade;
		  String nome;
			
		  System.out.println ("Escreva seu nome:");
		   nome = s.next ();
		   
		  System.out.println ("Escreva sua idade:");
		  idade = s.nextDouble ();
		  
		  if (idade >18) {
			  
			  System.out.println ("Você é maior de idade");
			  
		  } else {
			  
			  System.out.println ("Você é menor de idade");
		  }
		  
	} 
} 