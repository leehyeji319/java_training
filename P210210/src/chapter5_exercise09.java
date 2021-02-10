import java.util.Scanner;

public class chapter5_exercise09 {
    //키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 
    //최고 점수 및 평균 점수를 구하는 프로그램.
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("---------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------");
            System.out.println("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1){
                //작성위치
                studentNum = scanner.nextInt();
                scores = new int[studentNum];

            } else if(selectNo == 2){
                //점수 입력
                for(int i=0; i<studentNum; i++){
                     System.out.print("scores[" + i + "]>");
                     scores[i] = scanner.nextInt();
                }

            } else if(selectNo == 3){
                //점수 리스트
                for(int i=0; i<studentNum; i++){
                    System.out.println("scores["+i+"]:" + scores[i]);
                }

            } else if(selectNo == 4){
                //분석(최고점수, 평균점수)
                int max = 0; 
                int sum = 0;
                double avg = 0.0;

                for(int i=0; i<studentNum; i++){
                    if(scores[i] > max){
                        max = scores[i];
                    }
                    sum += scores[i];
                 }

                avg = (double) sum / studentNum;

                System.out.println("최고 점수 :" + max);
                System.out.println("평균 점수 :" + avg);

                
            } else if(selectNo == 5){
                //종료 
                run = false;
            }
        }

        System.out.println("프로그램 종료.");
    }
    
    
}
