
public class MethodDemo {
	public static void main(String[] args) { // method란 코드의 아웃소싱이다.
		System.out.println("Program is Starting...");

		// static 없으니 멤버변수 -> 주소 필요
		MethodDemo me = new MethodDemo(); // 주소 불러와서 집 만듦
		me.makeSum(); // 공동작업 할꺼니깐 메소드별로 나눠서 만드는것. 유저하고는 상관없다. 개발자 들 이 유지보수하려고///// 이걸 주석처리하면 한번도 일을
						// 안함
		// 이게 Call by Name = invoke 한다고함
		me.makeSum();
		System.out.println("Program is Over...");
	}// 5줄 매번 쓰기 귀찮다. 어케 매번해 메소드 분리 ㄱㄱ
// 위에는 메인 블록 

// 얘는 이름있어야함
	void makeSum() { // 메소드 이름있어야함, 괄호있어야함 변수와 구분하려고, 리턴타입(이건 메소드 이름 앞에) 있어야한다. ㅂ 중괄호는 나중에 상속 할때 배움
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;

		}
		System.out.println("sum = " + sum);
		System.out.println("Method is Over");
	}// 가지고 갈껀지 여부는 메소드의 이름앞에 쓴다.
}