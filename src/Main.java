public class Main {
    public static void main(String[] args) {
        //프로그램의 시작 지점
        System.out.println("Hello world!"); //""은 문자열(String)을 의미
        System.out.println("문자열을 작성");
        System.out.print("줄바꿈 \n");
        System.out.println("자동으로 줄바꿈");

        System.out.print("만나서 반갑습니다.\n빨리 안드로이드 앱을 만들어보고 싶습니다.\n모두 화이팅합시다.\n\n");
        //변수 (변할 수 있는 값 또는 수)
        //자료형 String(문자열), int(정수), boolean(참 또는 거짓)
        String a = "a 변수";
        System.out.println(a);
        a = "변하는 변수";
        System.out.println(a);

        int aInt = 10;
        System.out.println(aInt);

        boolean aBool = true;
        System.out.println(aBool);

        //조건문 : if 만약 ~라면... ==, ~가 아니라면 !=
        //중단점 활용 : 중단점 찍고 디버그로 실행 F8로 한단계씩 실행, F9다음 중단점 까지 쭉 실행
        if(aInt == 10){
            System.out.println("10이 맞습니다!");
        } else if (aInt==11) {
            System.out.println("11이 맞습니다!");
        } else {
            // 모든 조건이 모두 아닌 경우 실행
            System.out.println("10, 11이 아닙니다.");
        }

        switch (aInt){
            case 10:
                System.out.println("(스위치)10이 맞습니다!");
                break;
            case 11:
                System.out.println("(스위치)11이 맞습니다!");
                break;
            default:
                System.out.println("아무것도 해당 안 됨!");
                break;
        }
        //만약 브레이크를 쓰지 않으면?
        switch (aInt){
            case 10:
                System.out.println("(스위치)10이 맞습니다!");
            case 11:
                System.out.println("(스위치)10또는 11이 맞습니다!");
                break;
            default:
                System.out.println("아무것도 해당 안 됨!");
                break;
        }
    }
}