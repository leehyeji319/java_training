public class p179_EnumMethodExample {
    public static void main(String[] args) {
        //name method
        //열거 객체가 가지고 있는 문자열을 리턴한다. 
        //리턴되는 문자열은 열거 타입을 정의할때 사용한 상수 이름과 동일
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);

        //ordinal() method
        //열거 객체의 순번은 열거 타입을 정의할 때 주어진 순번을 말한다. 0번부터 시작
        int ordinal = today.ordinal();
        System.out.println(ordinal);

        //compareTo() 메소드
        //매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지 비교
        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        //valueOf() 메소드
        //매개값으로 주어지는 문자열과 동일한 문자열을 가지는 
        //열거 객체를 리턴한다. 외부로부터 문자열을 입력받아 열거 객체로 반환
        if(args.length == 1){
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY){
                System.out.println("주말 이네요");
            } else{
                System.out.println("평일 이네요");
            }
        }
        

        //values() 메소드 
        Week[] days = Week.values();
        for(Week day : days){
            System.out.println(day);
        }
    }
}
