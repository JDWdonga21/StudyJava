package Pack2;

public class Anime {
    String haruhi = "히라노 아야";
    public String nagato = "치하라 미노리";
    private String mikuru = "고토 유코";
    protected String testPro = "프로텍티드 실험";

    public static void main(String[] args) {
        Anime anis2 = new Anime();
        String test2 = anis2.mikuru;
        System.out.println(test2);
    }
}
