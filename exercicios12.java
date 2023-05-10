package exercicios10;

import java.util.Scanner;
public class exercicios12 {
public static void main (String[] args){
	 
  Scanner s = new Scanner (System.in);
	  
  double numero1, numero2 ;
  
   
  System.out.println ("Escreva um numero:");
  numero1 = s.nextDouble ();
  
  
  System.out.println ("Escreva outro numero:");
  numero2 = s.nextDouble ();
  
  if (numero1<numero2) {
	  
	  System.out.println ( numero1+ " é o menor numero" );
	

  }
  else if (numero2 < numero1) {
	  
	  System.out.println ( numero2+ " é o menor numero" );
	  
  }
  
  
 }
}
  
  
  
  