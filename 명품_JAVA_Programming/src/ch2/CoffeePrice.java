package ch2;
//예제 2-15: switch문 활용 
import java.util.Scanner;

public class CoffeePrice {
    public static void main(String[]args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("무슨 커피를 드릴까요? ");
    	String order = scanner.next();
    	int price = 0;
    	switch(order) {
    	case "에스프레소":
    	case "카푸치노":
    	case "카페라떼":
    		price = 3500;
    		break;
    	case "아메리카노":
    		price = 2000;
    		break;
    	default:
    		System.out.println("메뉴에 없습니다!");
    	}
    	if(price != 0)//가격이 0이 아닌 경우에만 아래의 문장을 실행하기 위한 조건문입니다.
    		System.out.print(order +"는"+price+"원입니다.");
    	scanner.close();
    }
}
