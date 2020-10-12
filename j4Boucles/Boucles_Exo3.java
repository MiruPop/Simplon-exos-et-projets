//Écrire un programme affichant les tables de multiplications des nombres de 1 à 10 dans un tableau à deux entrées

package j4Boucles;

public class Boucles_Exo3
{
	public static void main(String[] args)
	{
		int myTab [][] = new int[11][11];
		
		for (int i=1;i<=10;i++)
		{
			for (int j = 1;j<=10;j++)
			{
				myTab[i][j] = i*j;
				System.out.print(myTab[i][j] + "  ");
			}
		System.out.print("\n");
		}
	}
}