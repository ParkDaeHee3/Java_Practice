package ch3;
//예제 3-6: break문을 이용하여 while 문 벗어나기 

import java.util.Scanner;
public class BreakExample {
 public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("exit을 입력하면 종료합니다.");
	 while(true){//무한 루프를 시작합니다. 무한 루프는 조건이 항상 참(true)인 경우에만 종료됩니다.
		System.out.print(">>");
		String text = scanner.nextLine();//사용자로부터 문자열을 입력받습니다.
		if(text.equals("exit")) // "exit"이 입력되면 반복 종료 
			break; //while문을 벗어남 
		    //입력된 문자열이 "exit"과 같으면, 즉 사용자가 "exit"을 입력하면 무한 루프를 종료하고 반복문을 벗어납니다.
	 }
	 System.out.println("종료합니다.");
	 
	 scanner.close();
 }
}
