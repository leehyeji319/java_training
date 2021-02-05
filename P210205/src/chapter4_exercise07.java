import java.util.Scanner;

public class chapter4_exercise07 {
    //while문과 scanner를 이용해서 키보드로부터 입력된 데이터로 
    //예금, 출금 조회, 종료 기능을 제공
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("--------------");
            System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------");
            System.out.println("선택>");

            int number = scanner.nextInt();
            int money = 0;

            switch(number){
                case 1:
                    System.out.println("예금액> ");
                    money = scanner.nextInt();
                    balance += money;
                    break;
                case 2:
                    System.out.println("출금액> ");
                    money = scanner.nextInt();
                    balance -= money;
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close(); //scanner도 열엇으면 닫아줘야함; ㅋㅋ
    }
}
