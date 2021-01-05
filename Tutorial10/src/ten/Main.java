package ten;

public class Main {

	public static int function(int number, int k) {
		//몇번째 약수를 찾는지
		for(int i = 1; i <= number; i++) //그 수까지 1씩 증가를 해나간다
		{
			if(number % i == 0) //a를 나눈 값 b 
			{
				k--; //k를 빼줘서..어떠한 약수를 찾을때마다 k를 빼준다.
				if(k == 0)
				{
					return i; //해당 i 값을 받아서 함수를 종료
				}
			}
		}
		return -1; //못찾으면 -1을 반환
	}
	
	public static void main(String[] args) { //반환형 x
		int result = function(3050, 10); //3050의 10번째 약수를 찾겟다
		if(result == -1)
		{
			System.out.println("3050의 10번째 약수는 없습니다.");
		}
		else
		{
			System.out.println("3050의 10번째 약수는 " + result + "입니다.");
		}

	}

}
