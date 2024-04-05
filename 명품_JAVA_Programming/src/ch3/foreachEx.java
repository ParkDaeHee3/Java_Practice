package ch3;
//예제 3-9: for-each 문 활용 
public class foreachEx {
      enum Week {월,화,수,목,금,토,일} //나열(enumeration)의 각 원소를 순차적으로 접근하는데 유용한 for문 
      
      public static void main(String[] args) {
    	  int [] n = {1,2,3,4,5};
    	  String names[] = { "사과","배","바나나","체리","딸기","포도"  };  
    	
    	  int sum = 0;
    	  //아래 for-each에서 k는 n[0],n[1],....n[4]로 반복 
    	  for(int k:n) {
    		  System.out.print(k+" "); //반복되는 k값 출력 
    		  sum+=k;
    	  }
    	  System.out.println("합은"+sum);
    	  
    	  //아래 for-each에서 s는 names[0],names[1]...,names[5]로 반복 
    	  for (String s:names)
    		  System.out.print(s+" ");
    	  System.out.println(); 
    	  
    	  //아래 for-each에서 day는 월,화,수,목,금,토,일 값으로 반복 
    	  for (Week day:Week.values())//열거형 Week의 모든 값(요일)을 반복하여 출력합니다. Week.values() 메서드를 사용하여 열거형의 모든 값에 접근할 수 있습니다.
    		  System.out.print(day+"요일 ");
    	  System.out.println();
      }
 }
      
      
      
      
      