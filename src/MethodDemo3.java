
public class MethodDemo3 {
public static void main(String[] args) {
	mymethod(5);//호출함, 해당하는 메소드로 점프 
	System.out.println(mymethod(50));
}

static String mymethod(int su) { // 한번, 한개만 리턴 
	if(su%2==0) return "Hello";
	else return "world";
	//	return "hello";
// 리턴 할 떄는 메소드의 리턴타입 따람. method 의 리턴타입하고 리턴값의 타입을 일치시켜야함 
		//return qwd,qwe 리턴은 하나만 가능
		//return;return; 리턴 2번은 안됨
		//경우에 따라 리턴 나눠주면 2개이상 가능 
		
}
}
