package ch3;
//예제 3-8: 배열 원소의 평균 구하기 

import java.util.Scanner;

public class ArrayLength {
   public static void main(String[]args) {
	  int intArray[] = new int[5]; //배열의 선언과 생성 
	  int sum = 0;
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.print(intArray+"개의 정수를 입력하세요>>");
	  for(int i = 0; i<intArray.length; i++) // for문 안에 length은 필요한 이유는 크기를 비교하기 위해서다.intArray.length = 5 와 같은 의미이다. 
		  intArray[i] = scanner.nextInt(); //키보드에서 입력받은 정수 저장 
	  
	  for(int i = 0; i<intArray.length; i++)
		  sum+= intArray[i]; // 배열에 저장된 정수 값을 더하기 
	  
	  System.out.print("평균은"+(double)sum/intArray.length);
	  scanner.close();
	  
   }
}
