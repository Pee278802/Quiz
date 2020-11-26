
public class Exercise {

	public static void main(String[] args) {
		// 1.
		System.out.println("1.");
		int n=1;
		while (n<=5) {
			System.out.println(n);
		n++;
		
		}
			System.out.println();
			
		// 2.
		System.out.println("2.");
		int total = 25;
		int number = 1;

		while (number <= (total/2) ) {
		    total = total - number;
		    System.out.println(total + " " + number);
		    number++;
		}
		System.out.println();
		    
		// 3.
		System.out.println("3.");
		int i = 1;
		while ( i <= 2){
			i++;
		int j = 1;
		while ( j <= 3) {
			j++;
		int k = 1;	
		while ( k <= 4) {
		    k++;
		            System.out.print("*");
		        }
		        System.out.print("!");
		    }
		    System.out.println();
		}
		System.out.println();
		
	
		
		System.out.println("4.");
		int c = 4;
		int count = 1;
		while (count <= c) {
			count++;
		}
		System.out.println(c);
		c = c /2;
		System.out.println(c);
	}
}

