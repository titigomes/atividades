package exercicios10;

import java.util.Scanner;

public class exercicio8 {
	

	public static void main(String[] angs){

	Scanner s = new Scanner (System.in);

	  double n1, n2, n3, n4 ;
	
	  System.out.println ("Escreva um numero:");
	   n1 = s.nextDouble ();
	   
	  System.out.println ("Escreva outro numero:");
	  n2 = s.nextDouble ();
		  
		  
	 System.out.println ("Escreva outro numero:");
	  n3 = s.nextDouble ();
	  
	  n4= (n2*n3)/n1;
	 
	   System.out.println ("N2 x N3 / N1 = " + n4);
		  
		   
}
}
