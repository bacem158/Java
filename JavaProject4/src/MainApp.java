import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int nbOccurence = 0 , n =0;
		int [] tabInt = new int[5];
		Scanner sc = new Scanner(System.in);
		int i;
		
		for ( i = 0 ; i < tabInt.length ; i++ )
		{
			System.out.println("Donner la valeur de la case : "+i);
			tabInt[i] = sc.nextInt();
		}
		
		for ( i = 0 ; i < tabInt.length ; i++ )
		{
			System.out.print(tabInt[i] + "|");
			
		}
		System.out.println(" ");
		System.out.println("Donner un nombre : ");
		n = sc.nextInt();
		
		for ( i = 0 ; i < tabInt.length ; i++ )
		{
			if (n == tabInt[i])
			{
				nbOccurence = nbOccurence + 1 ;
				
			}
			
		}
		if (nbOccurence > 0) {
			System.out.println("Nombre d'occurence est egale a : "+nbOccurence);

		}
		else {
			System.out.println("Nombre inexistant");
		}
		
		
        int [] count = new int[100];
		int stock = 0 ;
		for (i = 0 ; i < tabInt.length ; i++ )
		{
			stock = tabInt[i];
            count[stock]++;
		}
        for(i=1; i < count.length; i++)
        {	
        	if (count[i]>0){
            System.out.println(i+" se produit "+count[i]+" fois");}
        }
		sc.close();		
	}

}
