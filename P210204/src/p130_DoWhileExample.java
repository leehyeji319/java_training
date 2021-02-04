import java.util.Scanner;

public class p130_DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do{
            System.out.println(">");
            inputString = sc.nextLine();
            System.out.println(inputString);
        }while( ! inputString.equals("q")); //논리 부정 연산자로 inputString.equals("q") 가 리턴한 boolean값을 반대로 바꾼다. = false

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
