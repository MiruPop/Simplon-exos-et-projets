package j7Amis;

public class Personne
{
	private String nom;		//attribut: variable nom de type String
	private Personne ami;	//attribut: variable ami de type Personne
	
	Personne (String nom)					//constructeur 1
	{
		this.nom = nom;
	}
	Personne (String nom, Personne ami)		//constructeur 2 par surcharge ?
	{
		this.nom = nom;
		this.ami = ami;
	}
	public Personne getAmi()			// get/set pour accéder et mettre à jour la valeur d'une variable private
	{
		return ami;
	}
	public void setAmi(Personne ami) {
		this.ami = ami;
	}
	public String toString ()			//méthode
	{
		String message = "";
		message += "La personne s'appelle " + nom + ". ";
		if (ami != null)
		{
			message += nom + " est ami avec " + ami.nom;
		}
		else
			message += nom + " n'a pas d'ami";
		return message;
	}
}
