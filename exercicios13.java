package exercicios10;

import java.util.Scanner;	 
public class exercicios13 {
public static void main (String[] args){
	
	Scanner s = new Scanner (System.in);
	  
	  double numero1,kelvin,fahrenheit,reaumur,rankine;
	  
	   
	  System.out.println ("Escreva a temperatura:");
	  numero1 = s.nextDouble ();
	  
	  kelvin=  numero1 + 273.15  ;
	  fahrenheit = (numero1 * 9/5) + 32;
	  reaumur = numero1 * 4/5;
	  rankine = numero1 *9/5 + 491.67 ;
	  
	  System.out.println ("A temperatura em kelvin é: " +kelvin );
	  System.out.println ("A temperatura em fahrenheit é: " +fahrenheit );
	  System.out.println ("A temperatura em reaumur é: " +reaumur );
	  System.out.println ("A temperatura em rankine é: " +rankine );
	  
}
}