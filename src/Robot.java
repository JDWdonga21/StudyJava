public class Robot {
//    객체지향 프로그래밍 (OOP - Object Oriented Programming)
//    객체 (상태, 행동)
//
    //상태 (필드)
    public String robotName;
    public String robotType;

    //행동
    public void setWaking(){

    }
    public void setStop(){

    }
    public static void main(String[] args) {
        Robot robot = new Robot(); // 클래스를  생성(인스턴스 화) 하였고, 이때부터 클래스를 활용하기 시작
        robot.robotName = "로봇이름";

        Robot robot1 = new Robot();
        robot1.robotName = "로봇이름1";
    }
}
