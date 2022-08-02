import java.util.Arrays;

//api 써서 sorting 해보자   static sort(int a) // toString(int a) 
public class ArrayDemo {
public static void main(String[] args) {
	int [] array = {4,7,2,9,4,2,1,5,76,8,7,56,43,6};
	System.out.println("Before String");
	System.out.println(Arrays.toString(array)); // 단순 배열 출력 글자취급 
	
	Arrays.sort(array);
	System.out.println("After AscdingString"); // 오름차순
	System.out.println(Arrays.toString(array)); // 내림차순은? 
	
	System.out.println("After DecdingString");//내림차순
//	for(int i = 1 ;i<array.length;i++) {
//		for(int j=1;j<array.length;j++) {
//			int down = array[j];
//			array[j]
//		}
//	}
//	
	//시작을 제일 끝방에 맞춰놓고 하나씩 감소하면된다. 
	for(int i =array.length-1;i>=0;i--) { // -1 안해주면 마지막 방 인덱스보다 큰 숫자여서 안나온다. 
		System.out.print(array[i]+",");
	}
}//다시보기 
}
//api활용도 능력 