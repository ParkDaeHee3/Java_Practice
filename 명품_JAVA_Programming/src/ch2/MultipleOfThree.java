package ch2;
//예제 2-11: if-else 사용하기 
import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[]args) {
    	Scanner in = new Scanner(System.in);
  
    	System.out.print("수를 입력하시오: ");
    	int number =in.nextInt(); 
    	
    	if(number%3==0)
    		//력받은 수가 3의 배수인지 확인하는 조건문을 시작합니다.
    		//% 연산자는 나머지를 구하는 연산자이며, 입력받은 수를 3으로 나눈 나머지가 0이면 3의 배수입니다.
    		System.out.println("3의 배수입니다.");
    	else 
    		System.out.println("3의 배수가 아닙니다.");
    	in.close();//여기에서 scanner.close()으로 하면 오류 발생 
    	           // 왜냐하면 위에서 Scanner in 으로 선언을 했기 때문에 닫을때도 같은 명으로 해야함 
    }
    
}
