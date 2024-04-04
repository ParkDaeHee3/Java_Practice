package ch3;

import java.util.Scanner;

//예제 3-7: 배열에 입력받은 수 중 제일큰수 찾기 
public class ArrayAccess {
  public static void main(String[]args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  int intArray[] = new int [5]; // 배열 생성, 크기가 5인 정수형 배열을 생성합니다. 
	                                // 이 배열은 사용자로부터 입력받은 정수를 저장할 용도로 사용됩니다.
	  
	  int max = 0; //현재 가장 큰 수 즉,현재 가장 큰 수를 저장할 변수를 선언하고 0으로 초기화합니다.
	  System.out.println("양수 5개를 입력하세요."); 
	  for(int i = 0; i<5; i++) {
		  intArray[i] = scanner.nextInt();//입력받은 정수를 배열에 저장 
		  if(intArray[i]>max) // intArray[i]가 현재 가장 큰 수보다 크면 
			  max = intArray[i];//intArray[i]를 max로 변경 
	  }
	  System.out.print("가장 큰 수는" + max+"입니다.");
	  
	  scanner.close();
	  
  }
}
