package ch2;
// 예제 2-9: 비트 논리 연산과 비트 시프트 연산 

public class BitOperator {
   public static void main(String []args) {
	   short a = (short)0x55ff;
	   short b = (short)0x00ff;
	   
	   //비트 논리 연산 
	   System.out.println("[비트 연산 결과]");
	   //printf("%x\n", ...)는 결과 값을 16진수 형식으로 출력 
	   System.out.printf("%04x\n",(short)(a&b)); // 비트 AND 
	   System.out.printf("%04x\n",(short)(a|b)); // 비트 OR 
	   System.out.printf("%04x\n",(short)(a^b)); // 비트 XOR 
	   System.out.printf("%04x\n",(short)(~a));  // 비트 NOT 
	   
	   byte c = 20; // 0x14 
	   byte d = -8; // 0xf8 
	   
	   // 비트 시프트 연산 
	   System.out.println("[시프트 연산 결과]");
	   System.out.println(c<<2); //c를 2비트 왼쪽 시프트
	   System.out.println(c>>2); //c를 2비트 오른쪽 시프트. 0삽입(이동하면서 나오는 빈자리에 삽입) 0:양수표현 
	   System.out.println(d>>2); //d를 2비트 오늘쪽 시프트. 1삽입 (이동하면서 나오는 빈자리에 삽입) 1:음수표련
	   System.out.printf("%x\n", (d>>>2)); //d를 2비트 오른쪽 시프트. 0삽입 (이동하면서 나오는 빈자리에 삽입)
	   
   }
}
