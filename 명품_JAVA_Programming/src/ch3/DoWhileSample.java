package ch3;
//예제3-3: a-z까지 출력 
public class DoWhileSample {
    public static void main(String[] args) {
    	char c ='a';
    	
    	do {
    		System.out.print(c);
    		c = (char)(c+1);//현재 문자 c의 아스키 코드 값을 1 증가시킵니다. 
    		                //문자는 내부적으로 아스키 코드로 표현되며, 이 코드에서는 아스키 코드 값을 직접 조작하여 다음 문자를 얻습니다.
  
    	}while(c<='z');//루프의 조건은 현재 문자 c가 'z'보다 작거나 같은지를 확인합니다. 
    	               //따라서 'a'부터 'z'까지의 문자를 출력하는 동안 계속 반복됩니다
    }
}
