package sample;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 별의 개수");
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				System.out.print(" * ");
			
			}
			
			sc.close();
	}
	
	
}

