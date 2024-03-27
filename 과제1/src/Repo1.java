import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Repo1 {
	
	public static void main(String[] args) {
		int low, high; 
		int number;
		int i;
		Random r = new Random();
		number = r.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			i=0; 
			low = 0; 
			high = 99; 		
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			while(true) {
				System.out.println(low +"-" + high);
				System.out.print(i+1+">>");
				int n=0;

				try {
					n= scanner.nextInt();
				} 
				catch(InputMismatchException e) {
					System.out.println("정수만 입력하셔야 합니다!!");
					scanner.nextLine(); 
				}
				
				if(n>high || n<low)
					System.out.println("범위를 벗어났어요");
				else {
					if(n==number) {
						System.out.println("맞았습니다.");
						break; 
					}
					else if(n>number){ 
						System.out.println("더 낮게");
						high = n;					
					}
					else { 
						System.out.println("더 높게");
						low = n;									
					}
				}
				i++;
			} 
			
			System.out.print("다시하시겠습니까(y/n)>>");
			if(scanner.next().equals("n"))
				break; 
		}
		
		scanner.close();
	} 
}
