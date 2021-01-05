package ten_1;

public class Main {
	
	public static char function(String input) {
		//문자를 입력받아서 문자를 처리해서 반환하기
		return input.charAt(input.length() - 1);
		//string은 하나의 문자열을 의미하는 자료형. 내부적으로 class로 작성되어있다.
		//특정한 문자열에서 마지막에 위치한 캐릭터를 반환
		//length 는 길이 
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World의 마지막 단어는 " +function("Hello World"));
		//index 10의 값을 가져오는 것이다.
	}

}
