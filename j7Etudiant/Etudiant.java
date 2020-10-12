package j7Etudiant;

public class Etudiant
{
	private String nom;		//attribut privé de type String nommé nom
	
	public Etudiant (String nom)	//constructeur publique, 1 paramètre de type String, initialis. nom de l'étudiant
	{
		this.nom = nom;
	}
	public void travailler ()			//méthode 1
	{
			System.out.println(this.nom + " se met au travail !");
	}
	public void seReposer ()			//méthode 2
	{
			System.out.println(this.nom + " se repose.");
	}
}