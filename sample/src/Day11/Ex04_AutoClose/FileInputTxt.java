package Day11.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");					
			
			int read = 0;
			
			// fis.read() : txt 파일의 데이터를 한 글자씩 읽어오늘 메소드
			//				* 더 이상 읽어온 데이터가 없으면 -1을 반환
			// 가져올 글자가 없을 때 까지 반복한다.
			
			while( (read = fis.read() )!= -1) {
				System.out.print((char) read	);
			}
		} catch (FileNotFoundException e) {
			// FileNotFoundException : 파일이 존재하지 않을 때 발생하는 예외
			e.printStackTrace();
		} catch (IOException e) {
			// IOException : 입력 및 출력 과정에서 발생하는 예외
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}
		finally {
			if( fis != null) {
				try {
					fis.close();			// close() : 메모리 해제
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
