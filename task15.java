package tutorial;

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print(" Please Enter a number : ");
		n = sc.nextInt();
		
		if(n>0) {
		for (int i = 0; i <= n; i++) {
		    for (int j = 0; j < i; j++) {
		        System.out.print("#");
		    }
		    System.out.println("");
		}
		}
		else {
			for (int r = -n; r >= n; r--) {

		        for (int i = 0; i < 6 - r; i++) {
		            System.out.print(" ");
		        }

		        for (int c = r; c >= 1; c--){

		            System.out.print("#");
		        }
		        System.out.println();
		    }
		}
		
		// TODO Auto-generated method stub

	}

}
