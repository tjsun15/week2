
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Problem 5a
		
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x += 2; 	
		}
	
		//Problem 5b
		
		int a = 100;
		while (a >= 0) {
			System.out.println(a);
			a -= 3;
		}
		
		//Problem 5c
		
		for (int b = 1; b < 100; b += 2) {
			System.out.println(b); }
		
		//Problem 5d
		
		for (int c = 0; c < 100; c ++) {
			if (c % 3 == 0) {
				System.out.println("Hello");
				
			} else if (c % 5 == 0) {
				System.out.println("World");
				
			} else if (c % 3 == 0 && c % 5 == 0) { 
					System.out.println("HelloWorld");
					
						} else {
				System.out.println(c);
				
		}
		
			
		}
			
			
		}
	}

		
		
		
		
		
		
	


