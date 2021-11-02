import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter un entier s'il vous plait : ");
		number = sc.nextInt();
		int conteur = 1 ;
		for (int i=0 ; i < number ; i++) {
			for (int j=0 ; j<=i ; j++) {
			System.out.print(conteur+" ");
			conteur++;
			}
			
			System.out.println();
			}
			sc.close();
		}
}
