import java.util.Scanner;

// 0802 Task
public class 성적관리프로그램2 {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student jimin = new Student();
		input(jimin);
		calc(jimin); // 스캐너 필요없;
		output(jimin);// 스캐너 필요없;
		System.out.println("성적관리프로그램 끝");
	}//입력,계산,출력 -> 메인에서 안하고 다른 메소드에서 하겠다. 
	//주소 안씀? -> static
static void input(Student student) {
	Scanner sc= new Scanner(System.in);//sc가 만들어졌는데 input끝나면 사라짐. 그럼 만들어진 new Scanner는 주소를 찾아 갈 수없는 공간이됨. 이게 가비지. 가비지 컬렉터가 이걸 청소하는 것 
	System.out.print("Name : ");	student.name=sc.nextLine();
	System.out.print("Stu_No : ");	student.stu_no=sc.nextLine();
	System.out.print("Korean : ");	student.kor=sc.nextInt();
	System.out.print("English : ");	student.eng=sc.nextInt();
	System.out.print("Math : ");	student.mat=sc.nextInt();
}

static void calc(Student student) {
	student.tot=(student.kor + student.eng + student.mat);
	student.avg=student.tot/3;
	student.grade= (student.avg<=100 &&student.avg>=90)?'A':
		(student.avg<90 &&student.avg>=80)?'B':
			(student.avg<80&&student.avg>=70)?'C':
				(student.avg<70&&student.avg>=60)?'D':'F';
}
static void output(Student student) {
	System.out.println("<<<<<부산정보산업고등학교 성적관리프로그램>>>>>");
	System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
	System.out.println("--------------------------------------");
	System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.1f\t %c\n",
			student.name,student.stu_no,student.kor,student.eng,student.mat,student.tot
			,student.avg,student.grade);
}

}
