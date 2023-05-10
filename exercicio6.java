package exercicios10;

	import java.util.Scanner;
    import java.math.*;
	public class exercicio6 {

	 public static void main (String[] args){


	  Scanner s = new Scanner (System.in);
	  
	  double cat1, cat2, hip, resutado;
	  
	  System.out.println ("Escreva o primeiro cateto :");
	   cat1 = s.nextDouble ();
	   
	   System.out.println ("Escreva outro cateto :");
	   cat2 = s.nextDouble ();
	   
	   resutado = (cat1*cat1)+(cat2*cat2);
	   
	   resutado = Math.sqrt(resutado);
	   
	   System.out.println ("a Hipotenusa é :" + resutado);
	   
	   
	   
	 }
	}
	   