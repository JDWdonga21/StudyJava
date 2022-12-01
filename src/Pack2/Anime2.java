package Pack2;

public class Anime2 {

    public static void main(String[] args) {
        Anime anis = new Anime();
        String test = anis.haruhi;
        System.out.println(test);
//        String test2 = anis.mikuru;
//        'mikuru' has private access in 'Pack2.Anime'
    }
}
