//Saisir une note, afficher "ajourné" si note < 8, "rattrapage" entre 8 et 10, "admis" si > 10

package j2Conditions;

public class Conditions_Exo3
{
	public static void main(String[] args)
	{
	int note = 15;
	if (note > 10)
		System.out.println("admis");
	else if (note >= 8 && note <= 10)
		System.out.println("ratrappage");
	else
		System.out.println("ajourné");
	}
}