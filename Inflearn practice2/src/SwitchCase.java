
public class SwitchCase {

	public static void main(String[] args) {
		
		int month = 111;
		
		switch(month) {
			case 1:
				System.out.println("1월");
				break;
			case 2:
				System.out.println("2월");
				break;
			case 11:
				System.out.println("내생일월");
				break;
			default :
				System.out.println("일치하는 값 없음");
		}
	}
}
