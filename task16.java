package tutorial;

import java.util.Scanner;
import java.util.*;

public class task16 {

	public static String getLongestSWordFromUser(List<String> array) {
//		
//        
//		// TODO Auto-generated method stub
		 int totalLength = 0;
	        String longestString =null;
	        for (String sc : array) {
	            if (sc.length() > totalLength) {
	            	totalLength = sc.length();
	                longestString = sc;
	            }
	        }
	        return longestString;
	    }

	    public static void main(String[] str) {


	        Scanner sammy = new Scanner(System.in);
	        System.out.println("Enter a list of word and enter done when finished:");
	        ArrayList<String> list = new ArrayList<String>();    

	        while (!sammy.hasNext("done") && !sammy.hasNext("Done") )
	        {
	            list.add(sammy.next());
	        }

	        String longestWordFromUser = getLongestSWordFromUser(list);
	        System.out.format("longest word: %s\n", longestWordFromUser);



	}

}
