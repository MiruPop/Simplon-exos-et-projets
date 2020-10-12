package j7Amis;

public class EssaiAmi
{
	public static void main(String[] args)
	{
		Personne personneSeule = new Personne ("Suzanne");		//objet1
		Personne ami1 = new Personne ("Marc");					//objet2
		Personne ami2 = new Personne ("François",ami1);			//objet3
		ami1.setAmi(ami2);
				
		System.out.println(personneSeule.toString());
		System.out.println(ami2.toString());
		System.out.println(ami1.toString());
	}

}