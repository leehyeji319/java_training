
public class Main {

	public static int fibonacci(int number) {
		//���ڰ� �־����� ��, ���° �Ǻ���ġ �������� ���߱�. 
		int one = 1;
		int two = 1;
		int result = -1; //���� ������ ������ ��ȯ�ϴ� ��
		if(number == 1)
		{
			return one;
		}
		else if(number == 2)
		{
			return two;
		}
		else
		{
			for(int i = 2; i < number; i++)
			{
				result = one + two;
				one = two;
				two = result; //��ĭ�� �̵��ϴ� ����
			}
		}//�Ǻ���ġ ����
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println("�Ǻ���ġ ������ 5��° ���Ҵ� " + fibonacci(5) + "�Դϴ�.");

	}

}
