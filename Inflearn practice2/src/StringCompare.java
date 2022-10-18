import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
		String a = "치킨";
		
	    Scanner hong = new Scanner(System.in); //이거 오류 왜뜨지
	    String b = hong.nextLine();
	    
	    System.out.println(a.equals(b));
	}
	
	
 //문자를 비교하는 것이 아니라 메모리의 주소를 비교하기 때문에.. 문자열을 비교할 때에는 equals를 이용한다 
}
