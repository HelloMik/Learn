package lessons;

public class lesson5 {

	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);

			// "10" => 0x3130 => 10
			try {
				Integer j = Integer.parseInt(args[0]);
				Integer k = Integer.parseInt(args[1]);

				System.out.println("j = " + j);
				System.out.println("k = " + k);
				System.out.println("Sum = " + (j + k));
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("Error!");
			}
			
		} // end of for
		
		boolean bTrue = true;

//		for(;bTrue;) {}
		while(bTrue) {
			System.out.println("hello from while");
			bTrue=false;
		}
		
		
		int n = 0;
		
		do {
			
			n++;
//			one string  comment
			/*
			  multi
			  level
			comment
			 */
			
			if (n == 1)
				System.out.println("One");
			else if (n == 2) 
				System.out.println("Two");
			else if (n == 5) 
				System.out.println("Five");
			else
				System.out.println("Other");
			
			
			switch (n) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;

			case 5:
				System.out.println("Five");
				break;
				
			default:
				System.out.println("Other");
				break;
			}
			
			System.err.println("hello from do");
		} while (n < 5);
		
		
		
		int month = 8;

        switch (month) {
            case 1:  System.out.println("January");
            case 2:  System.out.println("February");
            case 3:  System.out.println("March");
            case 4:  System.out.println("April");
            case 5:  System.out.println("May");
            case 6:  System.out.println("June");
            case 7:  System.out.println("July");
            case 8:  System.out.println("August");
            case 9:  System.out.println("September");
            case 10: System.out.println("October");
            case 11: System.out.println("November");
            case 12: System.out.println("December");
                     break;
            default: break;
        }
		
		
		

		
		System.out.println("End");
	} // end of main

} // end of class
