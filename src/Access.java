import Pack2.Anime;

public class Access extends Anime{
//    접근제한자
//    public - 같은 프로젝트 안에만 있다면 어디서든 접근이 가능
//    protected - 같은 패키지에서만 접근 가능하지만 예외적으로 상속관계에서는 다른 패키지에서도 가능하다
//    default - 같은 패키지에서만 접근 가능 (기본)
//    private - 현재 클래스에서만 접근이 가능하고 그 외에는 접근불가
    public static void main(String[] args) {
        Anime ani = new Anime();
//        Anime.haruhi; // default
        //'haruhi' is not public in 'Pack2.Anime'. Cannot be accessed from outside package 접근 제한자로 인한 접근 안됨
        String naga = ani.nagato;
        System.out.println(naga);

//        String test = ani.testPro; //protected
//        'testPro' has protected access in 'Pack2.Anime'
//        이렇게 써야함
        Access newAccess = new Access();
        String tests = newAccess.testPro;
        System.out.println(tests);

//        메소드 - 특정 작업을 수행하는 명령

    }
}
