//Écrire un programme demandant la saisir d’une valeur n et affichant le carré de taille n

package j4Boucles;
import java.util.Scanner;

public class Boucles_Exo4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduisez un nombre positif différent de 0. n = ");
		int n = scanner.nextInt();
		char myTab[][] = new char [n][n];
		
		if (n == 0)
			System.out.println(":(");
		else
		{
			System.out.println("Voici un carré de taille n * n :");
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					myTab[i][j] = 'x';
					System.out.print(myTab[i][j]+"   ");
				}
				System.out.println("\n");
			}
		}
		
		scanner.close();
	}
}