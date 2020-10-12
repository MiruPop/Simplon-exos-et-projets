//Afficher la somme des n éléments du tableau t.

package j5Tableaux;

import java.util.Arrays;

public class Tableaux_Exo2
{
	public static void main(String[] args)
	{		
	        int [] t = {2,5,7,6,19};
	        System.out.println("Soit le tableaux " + Arrays.toString(t));
	        
	        int n = 0;
	        int somme = 0;
	        
	        while(n < t.length)
	        {
	        	somme += t[n];
	            n++;
	        }
	        System.out.println("La somme des des elements du tableau est: " + somme);
}
}