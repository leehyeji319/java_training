package ten_1;

public class Main {
	
	public static char function(String input) {
		//���ڸ� �Է¹޾Ƽ� ���ڸ� ó���ؼ� ��ȯ�ϱ�
		return input.charAt(input.length() - 1);
		//string�� �ϳ��� ���ڿ��� �ǹ��ϴ� �ڷ���. ���������� class�� �ۼ��Ǿ��ִ�.
		//Ư���� ���ڿ����� �������� ��ġ�� ĳ���͸� ��ȯ
		//length �� ���� 
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World�� ������ �ܾ�� " +function("Hello World"));
		//index 10�� ���� �������� ���̴�.
	}

}
