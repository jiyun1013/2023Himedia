package p230427;

public class t1039 {
	public static void main(String[] args) {
		short s =100;
//		short result =-s; ->s에 -를 붙혀서 int로 인식이 됨. int 타입을 short 타입으로 변경할 수 없다 (값 손실)
//		short result =s; -> 이건 인식이 됨
//		int result=-s; > 가능
		int result2=-s;
		
		System.out.println(s);
		System.out.println(result2);
	}

}
