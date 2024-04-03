package ch2;
//예제 2-14 switch 문으로 학점 매기기 
import java.util.Scanner;
public class GradingSwitch {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
	    System.out.print("점수를 입력하세요(0~100): ");
	    int score = scanner.nextInt();
	    
	    //switch문 안에는 case 와 default가 있다. 만약 마지막에 default 대신 case으로 사용하면 오류가 생김 
	    switch(score/10) {
	    case 10: //score = 100 
	    case 9: //score는 90~99 
	    	grade = 'A';
	    	break;
	    case 8://score는 80~89 
	    	grade ='B';
	    	break;
	    case 7://score는 70~79 
	    	grade = 'C';
	        break;
	    case 6://score는 60~69
	    	grade ='D';
	    	break;
	    default: //score는 59이하 
	    	//default 설명 
	    	//1.switch 문의 조건에 해당하는 모든 경우를 처리하는 것이 아닌 경우에 대비하여 기본 동작을 설정합니다.
	    	//2.예기치 못한 경우를 처리하여 프로그램의 안정성을 높입니다.
	    	//3.명시적인 default 동작을 지정하여 코드의 의도를 명확히 합니다.
	    	grade = 'F';
	    }
	    System.out.println("학점은"+grade+"입니다.");
	    scanner.close();
	}

}
