import java.util.Arrays;

public class ArrayDemo2_1 {
	public static void main(String[] args) {
		// 열들에 대한 소팅을 해보자
		// 행렬의 층을 바꿔보자
		int[][] array = { { 1, 2, 3, 4, 5 }, { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }

		};
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));

	
// 행렬 층바꿀때도 정수 위치바꿀때 정수변수 필요하듯이 행렬변수가 필요 
		int [] temp = array[0];
		array[0]=array[1];
	array[1]=temp;
System.out.println("<<0층>>");
System.out.println(Arrays.toString(array[0]));
System.out.println("<<1층>>");
System.out.println(Arrays.toString(array[1]));
}
}
