

public class lesson2a {

	public static void main(String[] args) throws InterruptedException {

		boolean bok = true;
		int k = 0;
		Integer i;
		String str = "Hello!";

		System.out.println(str);
/*
		while ( k > 0 ) {
			System.out.println(k--);
//			Thread.sleep(1000*60);
		}

		do {
			System.out.println(k--);
		} while ( k > 0 );
		
*/
		int month=8;
	
		switch (month) {
		case 1:
			System.out.println("Январь");
			break;
		case 2:
			System.out.println("Февраль");
			break;
		case 3:
			System.out.println("Март");
			break;
		case 4:
			System.out.println("Апрель");
			break;
		case 5:
			System.out.println("Март");
			break;
		case 6:
			System.out.println("Май");
			break;
		case 7:
			System.out.println("Июнь");
			break;
		case 8:
			System.out.println("Июль");
			break;
		case 9:
			System.out.println("Август");
			break;
		case 10:
			System.out.println("Сентябрь");
			break;
		case 11:
			System.out.println("Окт");
			break;
		case 12:
			System.out.println("Ноя");
			break;
				
		default:
			System.err.println("не правильный номер месяца");
			break;
		}
		
		
		
	} // end of main
} // end of class

