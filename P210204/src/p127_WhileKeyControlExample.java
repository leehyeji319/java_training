public class p127_WhileKeyControlExample {
    public static void main(String[] args) throws Exception{
        boolean run = true;

        int speed = 0;

        int KeyCode = 0;

        while(run){ //Enter키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외시킴 
            if(KeyCode!=13 && KeyCode!=10){
                System.out.println("------------------");
                System.out.println("1.종속 | 2.감속 | 3.중지");
                System.out.println("------------------");
                System.out.println("선택 : ");
            }

            KeyCode = System.in.read(); //키코드의 키를 읽음

            if(KeyCode == 49){
                speed++;
                System.out.println("현재 속도=" + speed);
            }else if(KeyCode == 50){
                speed--;
                System.out.println("현재 속도=" + speed);
            }else if(KeyCode == 51){
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
}
