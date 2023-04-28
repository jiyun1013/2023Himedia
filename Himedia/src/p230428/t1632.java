package p230428;

public class t1632 {
	public static void main(String[] args) {
		int[] scores = {9,7,8,9,8};
		
		int sum=0;
		for(int s:scores) {
			sum += s;
		}
		System.out.println("sum : "+sum);
		
		int sum2 = 0;
		for (int i = 0; i < scores.length;i++) {
//	    for (int i = 0; i < scores.length;i+=2)  -> 홀수 배열을 더하겠다
//	    for (int i = 1; i < scores.length;i+=2)  -> 짝수 배열을 더하겠다
			sum2 += scores[i];
		}
		System.out.println("sum2 : "+sum2);
	}

}
