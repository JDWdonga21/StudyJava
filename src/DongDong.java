public class DongDong extends Robot{
    String abc = "qwer";
    int iAbc = 10;
    //생성자
    public DongDong(String _test){
        System.out.println(_test);
    }
    //생성자2
    public DongDong(int _test, int _test2){
        System.out.println(_test + _test2);
    }
    //생성자를 따로 구현하지 않으면 프로그램이 자동으로 default 생성자를 만든다.

//    getter setter 게터세터 (Alt + Insert)
    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public int getiAbc() {
        return iAbc;
    }

    public void setiAbc(int iAbc) {
        this.iAbc = iAbc;
    }

    public static void main(String[] args) {
        String test = "test1234";
        int intTest = 3;
        int intTest2 = 6;
        DongDong dongDong = new DongDong(test);
        dongDong.robotName = "동동봇";

        DongDong dongDong2 = new DongDong(intTest, intTest2);
        // 이렇게 써도 동작은 하지만...
        dongDong2.abc = "qqqq";
        dongDong2.iAbc = 1111234;
        System.out.println(dongDong2.getAbc() + " " + dongDong2.getiAbc());
        // 개발자들이 암묵적으로 합의된 내용
        // 아! 데이터를 넣었구나
        dongDong2.setAbc("adfaafsd"); //setter 사용
        dongDong2.setiAbc(2134); //setter 사용
        // 아! 데이터를 가져왔구나
        System.out.println(dongDong2.getAbc() + " " + dongDong2.getiAbc()); //getter 사용

    }
}
