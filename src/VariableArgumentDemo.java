
public class VariableArgumentDemo {
	public static void main(String[] args) {
	int []array ={1,2};
	 mymethod(array); // 넘어가는 변수a,b : Argument  이게 가변적이라고 

	}
	
	
	static void mymethod(int ...array) { //받는변수c,d : Parameter  원래 A와P는 같은 타입, 개수여야한다. VA는 A가 몇개인지 모른다. P는 어떻게 받아야하나? -> 배열로넘기고 받는다. 
										//P는 배열로 넘어오지 않으니 []를 못쓴다. 새로운 부호 ... 사용한다. 
		
	}
}
