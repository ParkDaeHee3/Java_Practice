package ch2;

public class hello {
    
	public static int sum(int n, int m) {
		return n +m;         
	}    //메소드 
	
	//main() 메소드에서 실행 시작 
	public static void main(String[] args) {
		int i =20;
		int s;
		char a; 
		
		s = sum(i,10); //sum() 메소드 호출 
		a = '?';
		System.out.println(a);//문자 '?' 화면 출력 
		System.out.println("hello"); // "hello" 문자열 화면 출력 
		System.out.println(s); //정수 s 값 화면 출력 
	}
} 
// 여기까지가 public class hello의 클래스이다. 나머지 public class hello{} 중괄호 안에 들어가 있는 것들은 메소드이다. 