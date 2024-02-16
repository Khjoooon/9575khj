package Day03;

public class Ex14_GuguAll {

	public static void main(String[] args) {
		// (단)x(1~9)
		// 단에 대한 반복 : 1~9
		// 각 단의 곱    : 1~9
		
		// 중첩 반복문
		// A X B
		// i : 단(A)
		for (int i = 0; i <= 9; i++) {
			// j : 곱(B)
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
				System.out.println("\t");   // 탭(공백)
			}
				System.out.println();       // 한 단 끝 --> 다음줄로
		}
			for (int j = 1; j <= 9; j++) {
		}
	}
}
