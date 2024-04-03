package ch2;
//에제 2-10: if문 사용하기 
import java.util.Scanner;
public class SuccessOrFail {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	//Scanner 객체를 생성하여 사용자의 입력을 읽을 준비를 합니다. 
    	//System.in은 키보드 입력을 나타냅니다.
    
    	
    	System.out.print("점수를 입력하시오: ");
    	int score = scanner.nextInt();
    	if(score >= 80)
    		System.out.println("축하합니다! 합격입니다.");
    	
    	scanner.close();
    	//Scanner 객체를 닫아서 자원을 반환합니다. 
    	//이는 프로그램이 종료되기 전에 사용된 자원을 명시적으로 해제하는 것입니다.
    }
}
