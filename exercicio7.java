package exercicios10;

import java.util.Scanner;
import java.math.*;
public class exercicio7 {

	public static void main(String[] angs){

		  Scanner s = new Scanner (System.in);
		  
		  double numero1, resultado;
		
		  System.out.println ("Escreva um numero:");
		   numero1 = s.nextDouble ();
		   
		   resultado = Math.sqrt(numero1); 
		   
		   System.out.println ("A raiz quadrada de" +numero1+ "é:" + resultado);
	}
}

			   
