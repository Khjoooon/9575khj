package Day06.Ex01.ObjectArray;


import java.util.Scanner;

/*
 * 	책제목,	저자명을 갖는 Book 클래스를 정의하고,
 * 	Book 클래스타입의 객체 배열을 생성하여,
 * 	사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오.
 */
// ** 하나 클래스 파일에서 여러 개의 클래스를 정의할 수 있다.
class Book {
	String title, autor;		//책제목, 저자명

	//	생성자
	// alt + shift + S, O
	public Book() {
		this("제목없음", "작자미상");
		
	}

	public Book(String title, String autor) {
		this.title = title;
		this.autor = autor;
	}

	// toString()
	// : 객체를 출력문에 출력 시, 출력할 템플릿을 지정한 메소드
	// - @Object(최상위클래스)에 정의된 toString() 메소드를 오버라이딩하면
	// 	 반환값을 출력문에서 출력하는 객체를 대신하여 출력합니다.	
	@Override
	public String toString() {
		return "Book [title=" + title + ", autor=" + autor + "]";
	}
	
	
}
// 메인 클래스 : 클래스파일 이름과 클래스 이름은 같아야한다.
public class BookArray {
	
	public static void main(String[] args) {
		// Book 타입의 객체 배열 선언 및 생성
		Book[] bookAarry = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입력
		for (int i = 0; i < bookAarry.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			// Book 객체를 생성하여 객체배열 bookArray 에 대압
			bookAarry[i] = new Book(title, author);
					
			
		}
		
		// 출력
		for (Book book : bookAarry) {
			System.out.println(book);
		}
	
		sc.close();
		
	}

}
