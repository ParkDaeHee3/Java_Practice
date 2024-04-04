package ch3;
//예제 3-1: for 문을 이용하여 1부터 10까지 합 출력 
public class ForSample {
    public static void main(String []args) {
    	int sum = 0;
    	
    	for (int i=1; i<=10; i++) { // 1~10까지 반복
    		//1부터 10까지 반복하는 for 루프를 시작합니다. i 는 1에서 시작하여 10까지 1씩 증가합니다.
    		sum +=i; //각 반복에서 i 값을 sum에 더합니다. 따라서 sum에는 1부터 10까지의 숫자의 합이 누적됩니다.
    		System.out.print(i); //더하는 수 출력 
    		
    		//만약 i가 9 이하이면 '+'를 출력하고, 그렇지 않으면 '='와 합계를 출력합니다.
    		if(i<=9)//1~9까지는 '+'출력 
    		   System.out.print("+");
    		else {  // i가 10인 경우
    			System.out.print("="); //'=' 출력하고 
    			System.out.print(sum); // 덧셈 결과 출력 
    		}
    	}
    }
}
