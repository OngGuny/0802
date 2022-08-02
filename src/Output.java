
public class Output {
	static void output(Student student) {
		System.out.println("<<<<<부산정보산업고등학교 성적관리프로그램>>>>>");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("--------------------------------------");
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.1f\t %c\n",
				student.name,student.stu_no,student.kor,student.eng,student.mat,student.tot
				,student.avg,student.grade);
	}
}
