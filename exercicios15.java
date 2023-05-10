package exercicios10;

import java.util.Scanner;
public class exercicios15 {
public static void main (String[] args){
	 
  Scanner s = new Scanner (System.in);
	  
  double numero1 ;
  
   
  System.out.println ("Qual a temperatura?");
  numero1 = s.nextDouble ();
  
   
 if (numero1<18) {
	  
	  System.out.println ( "Esta um clima frio " );
	

  }
  else if (numero1<23) {
	  
	  System.out.println ( "Esta um clima agradavel " );
	  
  }
  else if (numero1>24)
  {
  System.out.println ("Esta um clima quente");
  }
 }
}
  