package Day03;

public class Ex08_While {
	
	public static void main(String[] args) {
		// 1~10 까지 공백을 두고 출력하시오.
		int a = 1;
		
		// while(조건) { 반복 실행문}
		// - 반복문에는 반드시 종료조건이 성립하도록 작성해야한다.
		while( a <= 10) {
			System.out.print( a++ + "  ");
		}
	}

}
