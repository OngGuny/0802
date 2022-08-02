import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] array) {
		//java ArrayDemo4  mango banana apple  이 과일들을 누가 받는가? main의 string args가 받는거  3개니까 방 3개 만들어진다. 자바의 배열은 runtime때 만들어진다. 유저가 입력하면 main메소드의 스트링 배열이 받는거.
		
//	for(int i=0;i<array.length;i++) {
//
//		System.out.println("array["+i+"]"+array[i]);
//		
		if(array.length !=3) {
			System.err.println("Usage Error");
			System.exit(-1);
		}
		int first = Integer.parseInt(array[0]); // "45"->45 
		int second = Integer.parseInt(array[2]); // "78"->78
		switch(array[1]) { // 스위치 안의 변수타입 6개 뿐 / break 사용 여부 / default 아무데나 써도된다 
		case "+" :	System.out.printf("%d + %d = %d\n",first,second,(first+second)); break;
		case "-" :	System.out.printf("%d - %d = %d\n",first,second,(first-second)); break;
		case "x" :	System.out.printf("%d x %d = %d\n",first,second,(first*second)); break;
		case "/" :	System.out.printf("%d / %d = %d\n",first,second,(first/second)); break;
		case "%" :	System.out.printf("%d %% %d = %d\n",first,second,(first%second)); break;
		default : System.out.println("그딴 연산자는 없습니다. ");
		}
	}
	}

