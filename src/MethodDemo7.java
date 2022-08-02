// 6에서 값복사였던걸 주소복사로 바꿔서 해보자. a,b를 배열로 만들자. 
public class MethodDemo7 {
public static void main(String[] args) {
	int [] array = new int[] {5,9};
	System.out.println("Befor Swap : a = "+array[0]+", b = "+array[1]);
	swap(array);
	System.out.println("After Swap : a = "+array[0]+", b = "+array[1]);
	
}
static void swap(int[] array) {// 주소에 의한 호출 
	System.out.println("In method : c = "+array[0]+", d = "+array[1]);
	int temp=array[0];
	array[0]=array[1];
	array[1]=temp;
	System.out.println("In method, After Swap : c = "+array[0]+", d = "+array[1]);
	
}// 값 바꿔치기로는 스왑잉 안되기 때문에 주소 바꿔치기를 해줘야한다. 

}

