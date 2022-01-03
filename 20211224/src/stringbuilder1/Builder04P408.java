package stringbuilder1;

public class Builder04P408 {

	public static void main(String[] args) {
		// String 괄호 에서 CharAt은 기본적으로 한 글자를 의미합니다.
		// deleteChatAt()은 그래서 문열 내부에서
		// 지정된 인덱스번호에 해당하는 딱 한 글자만 삭제하는
		// 로직을 의미합니다.
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.deleteCharAt(0);
		System.out.println(a);

	}

}
