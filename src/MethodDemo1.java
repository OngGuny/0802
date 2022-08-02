
public class MethodDemo1 {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");

		MethodDemo1 me = new MethodDemo1();
		me.makeSum(11,100); // 값을 이용한 호출 . Call by value 원하는 값을 이용해 부름  근데 꼭  1부터 더해야하나?
		me.makeSum(1,50);
		System.out.println("Program is Over...");
	}

	void makeSum(int start ,int last) { //범위를 지정 해 줄 수 있다.   헤더 : 이름. 리탄타입. 괄호
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start ; i <= last; i++) { // 범위도 변수로 정해줌 
			sum += i;

		}
		System.out.println(start+"부터" + sum+"까지의 합은 " +sum);
		System.out.println("Method is Over");
		return;//이게 숨겨져있는거다. 안보여도 
	}
}