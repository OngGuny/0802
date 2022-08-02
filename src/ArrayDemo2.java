import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 컴파일때 방이 만들어지는게 아니라, 런타임떄 메모리 고민을 안하기 때문에
		System.out.print("Row : ");
		int row = sc.nextInt();
		int [][] array = null;
		int[] rows = new int[row];
		for(int i=0; i<rows.length; i++) {
			System.out.print(i+"행의 Column : ");
			int column = sc.nextInt();
			int [] cols = new int[column];
			rows=cols; 
		}
	
	}
}
