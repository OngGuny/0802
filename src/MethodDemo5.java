//주소로 배달시켜보기
public class MethodDemo5 {
public static void main(String[] args) {//변수 타입 모은 같지 안으면 안바뀐다 아님 자동벼ㅛㄴ헌
	int original = 5;
System.out.println("Befor calling method, original ="+original);
mymethod(original);
System.out.println("After calling method, original ="+original);// 값복사라 메소드 갔다와도 변경이 안되는것 

	
}
static void mymethod(int target) { // 값복사. int target= original
	System.out.println("In method, target = "+target);
	target = 100;
	System.out.println("In method, target = "+target);
	
	
}
}




