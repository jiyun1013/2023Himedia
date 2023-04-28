package p230427;

public class t1436 {
	public static void main(String[] args) {
		byte a = 10;
		int b = 5;
		int c = 7;
		double d = 4.8;
		float f = 5.2f;
		
		int result1 = a + b;
//		byte result3 = a + b; -> byte가 안되는 이유: int랑 합치려고 할 때 int가 더 큰 단위
//                               저 작은 단위인 byte로 넣을 수 없음
		double result2 = c + d;
//		int result4= c + d; -> 
		float result5 = c + f;
//		int result6 = c + f; -> 소수점이 들어가서 int로 묶긴 어려움 (float가 소수점이라서 더 다양한 범위)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result5);
	}
}