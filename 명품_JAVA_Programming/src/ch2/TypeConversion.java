package ch2;

public class TypeConversion {
     public static void main(String[]args) {
    	 byte b =127; // byte 타입의 변수는 -128부터 127까지의 값을 표현할 수 있습니다.
    	 int i =100;//int 타입의 변수는 정수를 표현할 수 있는 32비트 크기의 자료형입니다.
    	 

    	 System.out.println(b+i);// byte 값과 int 값이 연산될 때, byte 값은 int로 자동 형변환됩니다.
    	 System.out.println(10/4);//정수 나누기를 수행하고 그 결과를 출력합니다. 결과는 2입니다.
    	 System.out.println(10.0/4);//실수 나누기를 수행하고 그 결과를 출력합니다. 결과는 2.5입니다.
    	 System.out.println((char)0x12340041);//강제 타입 변환 결과 0x41이 되며, 문자 A의 코드임 
    	 System.out.println((byte)(b+i));// byte와 int의 합을 byte로 형변환하여 출력합니다. 이때, 결과가 byte의 범위를 벗어나면 값이 잘립니다.
    	 System.out.println((int)2.9+1.8);
    	 System.out.println((int)(2.9+1.8));
    	 System.out.println((int)2.9+(int)1.8);
     }
}
