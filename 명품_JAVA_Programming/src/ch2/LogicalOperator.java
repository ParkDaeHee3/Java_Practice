package ch2;

//예제 2-7: 비교 연산자와 논리 연산자 사용하기 

public class LogicalOperator {
	public static void main(String []args) {
		// 비교 연산 
		System.out.println('a'>'b');// 'a'는 'b'보다 유니코드 값이 작으므로 false 이다.
		System.out.println(3>=2); 
		System.out.println(-1<0);
		System.out.println(3.45<=2);
		System.out.println(3==2); // '=='은 두조건이 같으면 true 
		System.out.println(3!=2); // '!='은 두조건이 같지 않으면 true 
		System.out.println(!(3!=2));//'3 != 2'가 true 를 반환하므로 이를 부정하면 false 가 출력된다. 
		
		//비교 연산과 논리 연산 복합 
		System.out.println((3>2)&&(3>4)); //논리 AND 연산자(&&)는 두 개의 조건이 모두 true일 때만 true를 반환 
		System.out.println((3!=2)||(-1>0));//논리 OR 연산자(||)는 두 개의 조건 중 하나라도 true이면 true를 반환
		System.out.println((3!=2)^(-1>0));//XOR (exclusive OR) 연산자(^)는 두 개의 조건 중 정확히 하나만 true일 때만 true를 반환
		                                  //XOR (만약 두조건 모두 true 일경우 false 출력, 두조건이 false일 경우에도 false 출력 ) 
	}

}
