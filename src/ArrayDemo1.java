
public class ArrayDemo1 {
	public static void main(String[] args) {
		// int[] array; // 1차원
		int[][] array2 ; // 선언 //2차원 ;; null번지 / 3차원도 똑같다. 그냥 주소(1차)안에 주소(2차)안에 주소(3차)... 로 진행된다.
		array2 = new int[2][3]; // 생성
		array2[0][0] = (int) (Math.random() * 10 + 1);
		array2[0][1] = (int) (Math.random() * 10 + 1);
		array2[1][0] = (int) (Math.random() * 10 + 1);
		array2[1][1] = (int) (Math.random() * 10 + 1);
		array2[1][2] = (int) (Math.random() * 10 + 1);
		array2[0][2] = (int) (Math.random() * 10 + 1);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("array["+i+"]["+j +"]=%d\t\n", array2[i][j]);
			}
		}// 0802 이까지 복습 
		// array
		// 2nd way
//	int [][]array; //선언 // d1,2,합쳐짐 
//	array=new int [][] {{3,4,5,6,}, {7,8,9,10}};
		// 3rd way
//	int [] array = { // 열의 주소
//			{1,2,3,4}//행의주소 
//			{5,6,7,8},
//			{9,10,11,12}};
//	
//	
		// <Ragged(Jagged)Array>
		// 1st way
//	int [] array ;
//	array = new int[3];
//	array[0]= new int [3]
//	array[1]= new int [2]
//	array[2]= new int [1]
//	array[0]= new int [3]// assignmnt 
//	array[0]= new int [3]									
//	array[0]= new int [3]
//	array[0]= new int [3]
//	array[0]= new int [3]
//	array[0]= new int [3]
//							
//2nd way
//	int [][]array; //선언 Declaration
//	array = new int[3][];
//	array[0]= new int[] {3,4,5,6,7,8};
//	array[1]= new int[] {9,10};
//	array[2]= new int[] {11,12,13,14};

//3rd way 
//		int[][] array = { // array는 행에대한주소
//				{ 3, 4, 5, 6 }, //
//				{ 7, 8 }, { 9, 10, 11, 12, 13, 14 } };
////차원 수에 따른 for 중첩을 해야한다. 
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("array[" + i + "] 층");
//			for (int j = 0; j < array[i].length; j++) { // 얼마나돌아야하나? 그 층의 길이 만큼
//				System.out.print("array["+j+"]["+j+"]="+array[i][j]+"\t");
//			}
//			System.out.println();
//		}

	}
}
