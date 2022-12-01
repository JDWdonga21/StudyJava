public class MethodExample {
//    메소트 : 접근제한자, 반환타입, 메소트 이름 (매개변수) {}
//    중복되는 코드를 줄일 수 있다.
    public void setPlay(){
        System.out.println("메소드 테스트");
    }
    public String getPrint(){
//        반환타입이 String 이기 때문에 중괄호 내부에서 구현되는 로직의 최종은 String타입으로 되돌려줘야 한다.
        return "리턴 테스트";
    }
    public void setPrintTest(){
        System.out.println("Hello from Main");
    }
    public static void main(String[] args) {
        MethodExample methodExample = new MethodExample();
        //methodExample.setPlay(); // 메소드 실행(호출)
        //String testRe = methodExample.getPrint();
        //System.out.println(testRe);

        //과제
        methodExample.setPrintTest();
    }
}
