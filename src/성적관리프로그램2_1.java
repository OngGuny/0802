import java.util.Scanner;

// 0802 Task
public class 성적관리프로그램2_1 {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램_1 시작");
		Student jimin = new Student();
		Input.input(jimin);
		Calc.calc(jimin); // 스캐너 필요없;
		Output.output(jimin);// 스캐너 필요없;
		System.out.println("성적관리프로그램_1 끝");
	}//입력,계산,출력 -> 메인에서 안하고 다른 메소드에서 하겠다. 
	//주소 안씀? -> static





}
