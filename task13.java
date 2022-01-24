package tutorial;
import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int value1 = sc.nextInt();
		System.out.println("Enter a number");
		int value2 = sc.nextInt();
		int sumofnum = value1 + value2;
		if((value1 == 65 || value2==65) || (sumofnum == 65))
			System.out.println("True");
		else {
			System.out.println("Fale");
		}
		
		// TODO Auto-generated method stub

	}

}
