package lessons;

import java.io.IOException;

public class lesson7 {

	public static void main(String[] args) throws IOException {

		byte[] arr = new byte[10];
		int a, b;
		
		System.out.print("Введите число а: ");
		System.in.read(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		String str = new String(arr);
		System.out.println("a = '" + str + "'");
		
		str = str.replaceAll("\r\n", "").trim();
		a = Integer.valueOf(str);
		System.out.println("a = " + a);
		
		System.out.println("END");
	}

}
