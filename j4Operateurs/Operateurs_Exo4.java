//Partager une somme entre 0 et 0.99 euros en pièces de 0.5, 0.2, 0.1, 0.05, 0.02 et 0.01 en utilisant le moins de pieces

package j4Operateurs;
import java.util.Scanner;

public class Operateurs_Exo4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduisez une somme d'argent entre 0 et 0,99 euros:");
		float somme = scanner.nextFloat();
		
		int nbP1 = (int)(somme / 0.5);
		float mod1 = (float)((somme % 0.5) + 0.001); //le modulo affiche 0.45999998, du coup on ajoute 0.001 pour arrondir
		int nbP2 = (int)(mod1 / 0.2);
		float mod2 = (float)(mod1 % 0.2 + 0.001);
		int nbP3 = (int)(mod2 / 0.1);
		float mod3 = (float)(mod2 % 0.1 + 0.001);
		int nbP4 = (int)(mod3 / 0.05);
		float mod4 = (float)(mod3 % 0.05 + 0.001);
		int nbP5 = (int)(mod4 / 0.02);
		float mod5 = (float)(mod4 % 0.02 + 0.001);
		int nbP6 = (int)(mod5 / 0.01);


		if (somme == 0)
			System.out.println("Dommage... revenez le jour de paye.");
		else
		{
			System.out.println("Pour payer la somme de "+somme+" euros en utilisant le moins de pièces possible vous utiliserez: ");
			
			if (nbP1 != 0)
				System.out.println(nbP1+" pièce(s) de 0,5 euros");
			if (nbP2 != 0)
				System.out.println(nbP2+" pièce(s) de 0,2 euros");
			if (nbP3 != 0)
				System.out.println(nbP3+" pièce(s) de 0,1 euros");
			if (nbP4 != 0)
				System.out.println(nbP4+" pièce(s) de 0,05 euros");
			if (nbP5 != 0)
				System.out.println(nbP5+" pièce(s) de 0,02 euros");
			if (nbP6 != 0)
				System.out.println(nbP6+" pièce(s) de 0,01 euros");

		}
		scanner.close();
	}
}