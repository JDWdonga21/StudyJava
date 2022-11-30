public class Car {
    public static void main(String[] args) {
//        반복문 실습
        System.out.println("반복문 실행");
        for(int i = 0; i <10; i++){
            System.out.print(i);

            // && and , || or
            if(i%2 == 0 && i != 0){
                System.out.println("(짝)반복문 실행");
            }
            else {
                System.out.println("(홀)반복문 실행 또는 0");
            }

        }
    }
}
