public class chapter4_exercise06 {
    //for문을 이용하여 실행결과와 같은 삼각형을 출력하는 코드
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
