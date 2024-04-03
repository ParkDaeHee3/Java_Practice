package ch2;

//에제 2-6: 대입 연산자와 증감 연산자 사용 

public class AssignmentIncDecOperator {
   public static void main(String[]args) {
	   int a=3, b=3,c=3;
	   
	   //대입 연산자 사례 
	   a+=3; //a = a+3 = 6 
	   b*=3; //b = b*3 = 9  
	   c%=2; //c = c%2 = 1 (나머지 값이 나온다.) 
	   System.out.println("a="+a+",b="+b+",c="+c);
	   
	   int d =3;
	   //증감 연산자 사례 
	   a = d++; // a=3, d=4 d++은 1증가하고 증가 전의 값 반환 = "postfix operator"
	   System.out.println("a="+a+",d="+d);
	   
	   a = ++d; // d = 5, a = 5  1증가하고 증가된 값 반환 ="prefix operator"
	   System.out.println("a="+a+",d="+d);
	   
	   a = d--; // a = 5, d = 4 1감소하고 감소 전의 값 반환 = "postfix operator"
	   System.out.println("a="+a+",d="+d);
	   
	   a = --d; // d= 3, a = 3  1감소하고 감소된 값 반환 = "prefix operator"
	   System.out.println("a="+a+",d="+d);
	   
	   
   }
}
