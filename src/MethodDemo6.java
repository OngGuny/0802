
public class MethodDemo6 {
public static void main(String[] args) {
	int a = 5, b=9;
	System.out.println("Befor Swap : a = "+a+", b = "+b);
	swap(a,b);
	System.out.println("After Swap : a = "+a+", b = "+b);
	
}
static void swap(int c, int d) {// 값 바꿔치기 
	System.out.println("In method : c = "+c+", d = "+d);
	int temp=c;
	c=d;
	d=temp;
	System.out.println("In method, After Swap : c = "+c+", d = "+d);
	
}// 값 바꿔치기로는 스왑잉 안되기 때문에 주소 바꿔치기를 해줘야한다. 

}

