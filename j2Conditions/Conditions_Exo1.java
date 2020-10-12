//Saisir l’âge de l’utilisateur et lui dire s’il est majeur ou s’il est mineur

package j2Conditions;
import java.util.Scanner;

public class Conditions_Exo1
{
	public static void main(String[] args)
	{
		System.out.println("Veuillez saisir votre age :");
		Scanner scanner = new Scanner(System.in);
		int ent = scanner.nextInt();
		
		if (ent <= 18)
			System.out.println("Vous etes donc mineur.");
		else
			System.out.println("Vous etes donc majeur.");
		scanner.close();
	}
}