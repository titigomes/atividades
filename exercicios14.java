package exercicios10;

import java.util.Scanner;	 
public class exercicios14 {
public static void main (String[] args){
	
	Scanner s = new Scanner (System.in);
	  
	  double numero1,reais,euros,ienes,pesosm,dolara ;
	  
	   
	  System.out.println ("Escreva o valor em dolar americano:");
	  numero1 = s.nextDouble ();
	  
	  reais =  numero1 * 4.98  ;
	  euros = numero1 * 225.08;
	  ienes = numero1 * 0.0074;
	  pesosm = numero1 * 17.87  ;
	  dolara = numero1 * 1.50 ;
			  
			  
	  System.out.println ("O valor em reais é: " +reais );
	  System.out.println ("O valor em euros é: " +euros );
	  System.out.println ("O valor em ienes é: " +ienes );
	  System.out.println ("O valor em pesos mexicanos é: " +pesosm );
	  System.out.println ("O valor em dolar australiano é: " +dolara );
	  
}
} 