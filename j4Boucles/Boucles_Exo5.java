//Ecrire une application qui permet d’afficher, en se basant de la boucle while, toutes les lettres de l’alphabet

package j4Boucles;

public class Boucles_Exo5
{
	public static void main (String[] args)
	{
		char c = 'a';
		while (c <= 'z')
		{
			System.out.print(c+" ");
			c++;
		}
	}
}