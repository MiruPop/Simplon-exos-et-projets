//Programme qui calcule le nombre de cartons � placer dans un camion. En entr�es: poids d�un carton et capacit� camion

package j4Operateurs;
import java.util.Scanner;

public class Operateurs_Exo2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vous trouverez dans notre parc de v�hicules celui qui est le plus adapt� pour le transport de votre marchandise!");
		System.out.println("On peut vous aider � calculer le nombre de cartons que vous pouvez transporter, en fonction du v�hicule choisi.");
		System.out.println("Combien p�se chaqun de vos cartons � transporter?");
		System.out.print("1 carton = ");
		float a = scanner.nextFloat();
		System.out.println("Introduisez maintenant la capacit� approximative de charge souhait�e:");
		float b = scanner.nextFloat();
		int c = (int)(b/a);
		System.out.println("Vous pouvez transporter "+c + " cartons.");
		scanner.close();
	}
}
	