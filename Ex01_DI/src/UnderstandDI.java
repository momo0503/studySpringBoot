import java.util.Date;

class Member {
	String name;
	String nickname;
	public Member() {}	
}


public class UnderstandDI {
	public static void main(String[] args) {
				
			System.out.println(2);
	}
	
	public static void memberUse1() {
		//강한 결합
		Member m1 = new Member();
		
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(1);
	
	}
	
	public static void memberUse2(Member m) {
		//약한 결합.
		Member m2 =m;
	}
	
	public static void getDate(Date d) {
		Date date = d;
		System.out.println(date);
	}	
}



