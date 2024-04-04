package ch3;
//예제 3-5: continue 문을 이용하여 양수 합 구하기 
import java.util.Scanner;
public class ContinueExample {
     public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.println("정수를 5개 입력하세요.");
    	 int sum = 0;
    	 for(int i = 0; i <5; i++) {
    		 int n = scanner.nextInt(); //키보드에서 정수 입력 
    		 if(n<=0)
    			 continue; //양수가 아닌 경우 다음 반복으로 진행 
    		 else 
    		   sum+=n;//양수인 경우 뎃셈, 즉,양수인 경우에만 sum에 현재 입력된 값을 더합니다. 
    		          // sum = sum+n
    	 }
    	 System.out.println("양수의 합은"+sum); //반복문이 끝나면 양수의 합을 출력합니다.
    	 
    	 scanner.close();
     }
}
