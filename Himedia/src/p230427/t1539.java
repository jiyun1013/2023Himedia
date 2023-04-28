package p230427;

public class t1539 {

	public static void main(String[] args) {
		char c1 = 'A' + 1; // ' ' 안에 있으면 문자값이 됨
		char c2 = 'A';
		char c3 = (char)(c2 + 1);   //산출 타입 : int
//		char c4 = (c2 + 1);  -> c2는 문자로 인식이 안되고 int로 인식되는 것 같아
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		System.out.printf("%d\n", (int)c2);
		System.out.printf("%c\n", c2);
		
//		System.out.println(c4);
	}
}
