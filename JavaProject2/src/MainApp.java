import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choix;
		int autreConversion;
		do
		{
		
		do
		{
			System.out.println("Entrez 1 pour convertir de Celsius en Fahrenheit");
			System.out.println("Entrez 2 pour convertir de Fahrenheit en Celsius");
			choix = sc.nextInt();
		}while(choix <1 || choix > 2);
		
		double temp�rature = 0 ;
		double convertie = 0 ;
		

		if (choix==1)
		{
			System.out.println("Entrez la temp�rature en Celsius");
			temp�rature = sc.nextInt();
			convertie = 9/5*temp�rature+32;
			System.out.println("La temp�rature en Fahrenheit = "+convertie);
		}
		else if (choix==2)
		{
			System.out.println("Entrez la temp�rature en Fahrenheit");
			temp�rature = sc.nextInt();
			convertie = 5/9*(temp�rature-32);
			System.out.println("La temp�rature en Celsius = "+convertie);
		}
		System.out.println("voulez vous faire un autre conversion ?");
		System.out.println("Si oui Tapez 1");
		autreConversion = sc.nextInt();
		}while(autreConversion <=1);
		sc.close();
	}

}