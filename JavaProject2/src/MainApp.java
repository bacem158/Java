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
		
		float température = 0 ;
		float convertie = 0 ;
		

		if (choix==1)
		{
			System.out.println("Entrez la température en Celsius");
			température = sc.nextFloat();
			convertie = 9/5*température+32;
			System.out.println("La température en Fahrenheit = "+convertie);
		}
		else if (choix==2)
		{
			System.out.println("Entrez la température en Fahrenheit");
			température = sc.nextFloat();
			convertie = 5/9*(température-32);
			System.out.println("La température en Celsius = "+convertie);
		}
		System.out.println("voulez vous faire un autre conversion ?");
		System.out.println("Si oui Tapez 1");
		autreConversion = sc.nextInt();
		}while(autreConversion <=1);
		sc.close();
	}

}
