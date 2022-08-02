import java.util.Arrays;

public class ArrayDemo3 {
public static void main(String[] args) { // 배열의 사이즈는 런타임때 만들어진다. 동적으로 생성됨 
//	String [] array = {"Hello","Neo","한지민"}; //박지민 홍지민 추가 했다가 줄임 
//	for(int i=0;i<array.length;i++) {// 방을 3개로 줄였는데 방을 5번돌리면? / 오류 발생 -> 그래서 숫자 안쓰고 배열의 길이를 사용 
//		System.out.println(array[i]); 
//	}
//	int []array= {1,2};
//	array = new int[3]; //그래서 이거 넣어줌 
//	array[2]=3;//자바의 배열은 리사이징이 안되기 때문에 새주소로 생성해야함.  
//	
	// 저걸 더 편하게 해기 위해 colletion  배우는거 
	
	// 값 복사 // 작은쪽을 큰쪽에 넣기 위해서는 갯수도신경써야하고 어디서부터 복사시작할껀지도 신경써야함  arraycopy 쓰면 된다. 
	//public static void arraycopy​(Object src/원본의, int srcPos/몇번쨰부터 , Object dest/타겟의, int destPos/몇번째부터, int length/몇개를 덮어?)
	
	
	int [] original = {1,2,3,4,5};
	int [] target = {10,9,8,7,6,5,4,3,2,1};
//	System.arraycopy(original, 2, target, 0, 3); // original의 3,4,5 를 target의 10,9,8을 덮어씀
//	System.out.println(Arrays.toString(target));
//	original[2]=100;
//	System.out.println(Arrays.toString(target)); // 이미 복사해놓은거라 오리지널을 바꿔도 안바뀜, = 링크안되어있기때문에 안바뀜 
//	
	System.arraycopy(original, 0, target, 9, 5);// 오류뜸. 
	
}
}
