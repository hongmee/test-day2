import java.util.Scanner;

public class Price {
	public static void main(String[] args) {
		System.out.println("음식 이름을 입력해보세요");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		
		switch(menu) {
				case "치킨" :
				System.out.println("맛있습니다");
				break;
				case "만두" :
				System.out.println("맛있긴 한데 그렇게 좋아하진 않습니다");
				break;
				case "명란젓" :
				System.out.println("존좋");
				break;
				default :
				System.out.println("DB에 존재하지 않습니다");
				
		}
	}
}
