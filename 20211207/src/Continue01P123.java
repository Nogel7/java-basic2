
public class Continue01P123 {

	public static void main(String[] args) {
		// continue문은 스킵기능을 생각하시면 됩니다.
		// 돌던 바퀴를 즉시 종료하고, 다음 바퀴를 이어서 실행합니다.
		// 전체 반복문을 종료시키는 break와 헷갈리지 않도록 주의하세요.
		
		for(int i = 1; i <10; i++) {
			if(i == 6 || i == 8) {
				System.out.println("출력되지 않습니다.");
				continue;// 컨티뉴를 만나면 시작지점(9번라인)으로 올라간다
			}
		    System.out.println("이번 수자는 " + i + "입니다.");
		}
		

	}

}