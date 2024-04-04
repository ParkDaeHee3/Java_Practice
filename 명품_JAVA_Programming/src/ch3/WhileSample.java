package ch3;
//예제 3-2: -1이 입력될 때까지 입력된 수의 평균 구하기 

import java.util.Scanner;
public class WhileSample {
   public static void main(String[] args) {
	   int count = 0;//정수형 변수 count를 선언하고 0으로 초기화합니다. 이 변수는 입력된 정수의 개수를 저장합니다.
	   int sum = 0; //정수형 변수 sum을 선언하고 0으로 초기화합니다. 이 변수는 입력된 정수들의 합을 저장합니다.
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
	   
	   int n = scanner.nextInt();
	   while(n!=-1) { //입력된 값이 -1이 아닌 동안에는 계속해서 반복합니다.
		   sum+=n; //입력된 수를 sum에 더합니다.
		   count++; //입력된 수의 개수를 하나 증가시킵니다.
		   n = scanner.nextInt(); //다음 입력을 받기 위해 사용자로부터 정수를 다시 입력받습니다. --> -20은 음수의 정수값이기 때문에 -가 없어지는게 아니다. 
		                          //int = 정수 값은 양의 정수, 음의 정수 및 0을 포함하는 모든 정수 값을 나타냄 
	   }
	   if(count == 0) System.out.println("입력된 수가 없습니다.");
	   else {
		   System.out.print("정수의 개수는" +count+"개이며");
		   System.out.println("평균은"+(double)sum/count+"입니다.");
	   }
	   scanner.close();
   }
}
