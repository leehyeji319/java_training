package ten;

public class Main {

	public static int function(int number, int k) {
		//���° ����� ã����
		for(int i = 1; i <= number; i++) //�� ������ 1�� ������ �س�����
		{
			if(number % i == 0) //a�� ���� �� b 
			{
				k--; //k�� ���༭..��� ����� ã�������� k�� ���ش�.
				if(k == 0)
				{
					return i; //�ش� i ���� �޾Ƽ� �Լ��� ����
				}
			}
		}
		return -1; //��ã���� -1�� ��ȯ
	}
	
	public static void main(String[] args) { //��ȯ�� x
		int result = function(3050, 10); //3050�� 10��° ����� ã�ٴ�
		if(result == -1)
		{
			System.out.println("3050�� 10��° ����� �����ϴ�.");
		}
		else
		{
			System.out.println("3050�� 10��° ����� " + result + "�Դϴ�.");
		}

	}

}
