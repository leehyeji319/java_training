public class chapter4_exercise03 {
    public static void main(String[] args) {
        //작성위치 -
        //for문을 이용하여 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를작성해보세요 
        int i; 
        int sum = 0;
        for(i=1; i<=100; i++){
            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
