//Programme qui calcule le nombre de cartons à placer dans un camion. En entrées: poids d’un carton et capacité camion

package j4Operateurs;
import java.util.Scanner;

public class Operateurs_Exo2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vous trouverez dans notre parc de véhicules celui qui est le plus adapté pour le transport de votre marchandise!");
		System.out.println("On peut vous aider à calculer le nombre de cartons que vous pouvez transporter, en fonction du véhicule choisi.");
		System.out.println("Combien pèse chaqun de vos cartons à transporter?");
		System.out.print("1 carton = ");
		float a = scanner.nextFloat();
		System.out.println("Introduisez maintenant la capacité approximative de charge souhaitée:");
		float b = scanner.nextFloat();
		int c = (int)(b/a);
		System.out.println("Vous pouvez transporter "+c + " cartons.");
		scanner.close();
	}
}
	