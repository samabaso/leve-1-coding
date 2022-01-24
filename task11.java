package tutorial;

public class task11 {
	  static void taskmultiples(int n ){
		 
		    for(int i = 0; i < n; i++)
		      if(i % 3 == 0 || i % 5 == 0)
		        System.out.println(i);
		  }

		  public static void main(String[] args){
		    taskmultiples(1000);
			 
		  }
		// TODO Auto-generated method stub
	}
