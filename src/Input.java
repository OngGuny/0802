import java.util.Scanner;

//파일을 나눠보자 공동작업을 위해 
public class Input {
	static void input(Student student) {
		Scanner sc= new Scanner(System.in);//sc가 만들어졌는데 input끝나면 사라짐. 그럼 만들어진 new Scanner는 주소를 찾아 갈 수없는 공간이됨. 이게 가비지. 가비지 컬렉터가 이걸 청소하는 것 
		System.out.print("Name : ");	student.name=sc.nextLine();
		System.out.print("Stu_No : ");	student.stu_no=sc.nextLine();
		System.out.print("Korean : ");	student.kor=sc.nextInt();
		System.out.print("English : ");	student.eng=sc.nextInt();
		System.out.print("Math : ");	student.mat=sc.nextInt();
	}
}
