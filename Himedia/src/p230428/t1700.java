package p230428;

public class t1700 {
	public static void main(String[] args) {
		int i = 1;
		
		//    while (true) -> 항상 참이다: 무한
		while (true) {
			System.out.println(i);
			
			if(i == 6)
				break;
			
			i = i + 1;
		}
	}
}
