import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0 , n  ;
		System.out.println("Donner la taille du tableau : ");
		n = sc.nextInt();
		int [] tabInt = new int[n];
		for ( i = 0 ; i < tabInt.length ; i++ )
		{
			System.out.println("Donner la valeur de la case : "+i);
			tabInt[i] = sc.nextInt();
		}
		
		for ( i = 0 ; i < tabInt.length ; i++ )
		{
			System.out.print(tabInt[i] + "|");	
		}
		System.out.println("\n \n****************************************************** ");
		System.out.println("Vous voulez triez ce tableau ascendant ou descendant ? "
				+ "\n1 - ascendant"
				+ "\n2 - descendant");
		int choice = sc.nextInt();
		if (choice == 1)
		{
		for (int i1 = 0; i1 < tabInt.length; i1++) {
			for (int j1 = i1 ; j1 < tabInt.length; j1++) {
				if (tabInt[i1] > tabInt[j1]) {
					int temp = tabInt[i1];
					tabInt[i1] = tabInt[j1];
					tabInt[j1] = temp;
				}
			}
		}
		System.out.println("\n \n****************************************************** ");
		System.out.println("Tableau trié ascendant");
		for (int i1 : tabInt) {
			System.out.print(i1+"|");
		}
		}
		else if (choice == 2)
		{
			for (int i1 = 0; i1 < tabInt.length; i1++) {
				for (int j1 = i1 ; j1 < tabInt.length; j1++) {
					if (tabInt[i1] < tabInt[j1]) {
						int temp = tabInt[i1];
						tabInt[i1] = tabInt[j1];
						tabInt[j1] = temp;
					}
				}
			}
			System.out.println("\n \n****************************************************** ");
			System.out.println("Tableau trié descendant");
			for (int i1 : tabInt) {
				System.out.print(i1+"|");
			}	
		}
	}

}
