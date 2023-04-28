package p230428;

public class t1209 {
	public static void main(String[] args) {
		int n = (int)(Math.random()*6)+1;
		// 1<=(int)6x+1 <7 위에 매쓰랜덤6어쩌고 이거임 (뒤에 +1있어서) 
		
		switch(n) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}

}
