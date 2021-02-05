public class chapter4_exercise04 {
    //문제 - while문과 math.random() 메소드를 이용해서 두 개의 주사위를 던졌을때
    //나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈춘다.

    public static void main(String[] args) {
        while(true){
            int i = (int)(Math.random()*5 + 1);
            int j = (int)(Math.random()*5 + 1);
            int z = i+j;
            System.out.println("(" + i + "," + j + ")");
            if(z == 5){
                break;
            }
        }
        System.out.println("프로그램 종료.");
    }
}
