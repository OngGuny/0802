
public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");

		MethodDemo2 me = new MethodDemo2();
		int start=1, last=100; // 지역변수라 이름 같아도 된다. 
		int result = me.makeSum(start,last); // 값을 이용한 호출 . Call by value 원하는 값을 이용해 부름  근데 꼭  1부터 더해야하나? , 시작값, 끝값 가지고 간다! 
		System.out.println(result); //갔다 온 값은 result에 들어가고 표시됨
		System.out.println(start+"부터" + last+"까지의 합은 " +result); 		
		
		start=30; last=50; // sum 
		result = me.makeSum(30,50);
		System.out.println(result);// 한번더 갔따오고 여기에 표시 
		System.out.println(start+"부터" + last+"까지의 합은 " +result); 
		System.out.println("Program is Over...");
	}

	int makeSum(int start ,int last) { //범위를 지정 해 줄 수 있다.   헤더 : 이름. 리탄타입. 괄호// 뭐 가지고 오나?? 
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start ; i <= last; i++) { // 범위도 변수로 정해줌 
			sum += i;

		}
		//System.out.println(start+"부터" + last+"까지의 합은 " +sum); 이걸 main에서 처리해도 된다. 위로 올림 
		System.out.println("Method is Over");
		//return; void에 기본 return 이라 빈손으로 감
		return sum; // void인데 sum가져간다해서 오류 ->void int로 바꿔줌 long 으로 바꿔도댐. 더 큰 범위값은 가능  축소는 안됨 short 인데 int는 못가져옴 
		
		
	}
}