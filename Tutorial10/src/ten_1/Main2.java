package ten_1;

public class Main2 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b; //���� ������
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a,b);
		result = max(result, c);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("(345, 567, 789) �� ���� ū ���� " + function(345,567,789));
	}

}
