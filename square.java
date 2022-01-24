package tutorial;
import java.util.Scanner;

public class square {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.print(" Please Enter any Side of a Square : ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= n; j++)
			{
				System.out.print("#"); 
			}
			System.out.print("\n"); 
		}
	}

}
