package tutorial;
import java.util.Scanner;

public class task12 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int value1 = sc.nextInt();
		System.out.println("Enter a number");
		int value2 = sc.nextInt();
		int sumofnum = value1 + value2;
		
		if (( value1 ==3 || value2==3) && (sumofnum % 3 == 0))
			System.out.println("true");
		else {
			System.out.println("false");
		}
	}

}
