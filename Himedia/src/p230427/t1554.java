package p230427;

public class t1554 {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;  //int로 넣을 수 있는 값이 넘쳐서 깨졌음
		long lz1 = (long)x *(long)y;
		long lz2 = (long)(x * y); //이미 깨져서 long에 넣어도 그 값 그대로임
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}

}
