//Afficher l’indice d’un élément n dans le tableau t

package j5Tableaux;

import java.util.Arrays;

public class Tableaux_Exo3
{
	public static void main(String[] args)
	{
		int t[] = {1,2,3,4,5};
		
		System.out.println("Soit le tableau t"+Arrays.toString(t));
		
		for (int i = 0; i < t.length; i++)
		{
			System.out.println("L'index de l'élément t[" + t[i] + "] est : " + i);
		}
		

	}
}