package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해 주시고
		// 다른 하나는 입력 없이 생성해주세요.
		Parttimer p1 = new Parttimer(false, 15000, "빠리바케트", "이성민");
		Parttimer p2 = new Parttimer(true, "투썸", "임재원");
		Parttimer p3 = new Parttimer(false, 6000, "빠리바케트", "이성민");
		
		}

}