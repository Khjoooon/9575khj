package Day03;

import java.util.Scanner;

public class Ex03_Elself {
	
	public static void main(String[] args) {
		// 학생의 성적을 입력받고, 성적에 따라 학점을 출력하시오.
		// 90점 이상이면, A
		// 80점 이상이면, B
		// 70점 이상이면, C
		// 60점 이상이면, D
		// 50점 이상이면, F
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		// 조건을 만족할 때, 실행할 실행문이 1문장이면 {} 생략가능
		if ( score >= 90 && score <= 100 ) grade = 'A';
		if ( score >= 80 && score < 90 )   grade = 'B';
		if ( score >= 70 && score < 80 )   grade = 'C';
		if ( score >= 60 && score < 70 )   grade = 'D';
		if ( score >= 60 && score >= 0 )   grade = 'F';
		System.out.println("학점 : " + grade);
		
		// if~else if~else
		if ( score >= 90 && score <= 100 )
            grade = 'A';
		else if( score >= 80 )
			grade = 'B';
		else if( score >= 70 )
			grade = 'C';
		else if( score >= 60 )
			grade = 'D';
		else 
			grade = 'F';
		System.out.println("학점 : " + grade);
	
		sc.close();
	}

}
