package game.inheritance;

public class Commoner {
	protected int lv;
	protected int hp;
	protected String id;
	protected int mp;
	
    public Commoner(String id) {
    	// 생성자 내부에서 멤버변수를 초기화할때는 this.을 붙이는 경우가 많습니다.
	    this.id = id;
	    this.hp = 20;
	    this.lv = 1;
	    this.mp = 10;
	}
public void getinfo() {
	System.out.println("아이디 : " + id + ", 레벨 : " + lv + ", 체력 : " + hp + ",마나 :" + mp);
 }
}
