//Écrire un programme affichant la table de multiplication d’un nombre saisi par l’utilisateur

package j4Boucles;
import java.util.Scanner;

public class Boucles_Exo2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez un nombre entier:");
		System.out.print("n = ");
		int n = scanner.nextInt();
		for (int i = 1;i<=10;i++)
			System.out.println(n+" * "+i+" = "+n*i);
		
		scanner.close();
	}
}