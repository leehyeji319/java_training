
public class Main {

	public static int fibonacci(int number) {
		//숫자가 주어졌을 때, 몇번째 피보나치 수열인지 맞추기. 
		int one = 1;
		int two = 1;
		int result = -1; //뭔가 문제가 있을때 반환하는 값
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
				two = result; //한칸씩 이동하는 것임
			}
		}//피보나치 수열
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println("피보나치 수열의 5번째 원소는 " + fibonacci(5) + "입니다.");

	}

}
