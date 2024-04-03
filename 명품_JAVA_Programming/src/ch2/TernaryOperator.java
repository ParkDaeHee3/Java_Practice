package ch2;

// 예제 2-8: 조건 연산 
// condition ? opr2 : opr3 (삼항 = ternary 연산자)
// condition이 true이면 연산식의 결과는 opr2, false이면 opr3 

public class TernaryOperator {
 public static void main(String[]args) {
	 int a = 3, b = 5;
	 
	 System.out.println("두 수의 차는"+((a>b)?(a-b):(b-a)));
	 //(a > b)는 a가 b보다 큰지를 확인합니다. 만약 참이면 a - b를 반환하고, 거짓이면 b - a를 반환합니다.
	 //따라서, a가 b보다 크면 a - b가 되고, 그렇지 않으면 b - a가 됩니다.
 }
}
