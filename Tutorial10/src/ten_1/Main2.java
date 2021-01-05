package ten_1;

public class Main2 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b; //삼항 연산자
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a,b);
		result = max(result, c);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("(345, 567, 789) 중 가장 큰 값은 " + function(345,567,789));
	}

}
