package seven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt(); 
		System.out.println("입력된 정수는 " + i  + "입니다.");
		sc.close(); //안정적으로 끝내게 입력해주는게 좋음
	}

}
