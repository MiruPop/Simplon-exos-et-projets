//Ecrire une application qui permet d�afficher des nombres entr�s par l�utilisateur tant qu�ils sont inf�rieur � 10

package j4Boucles;
import java.util.Scanner;

public class Boucles_Exo6
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduisez un nombre :");
		int nbr = scanner.nextInt();
		
		while (nbr < 10)
		{
			System.out.println("Vous avez choisi: "+nbr);
			nbr = scanner.nextInt();
		}
		if (nbr >= 10)
		{
			System.out.println("Je n'affiche pas les nombres sup�rieurs � 10.");
		}
		scanner.close();
	}
}