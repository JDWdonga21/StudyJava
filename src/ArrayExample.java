import java.util.ArrayList;

public class ArrayExample {


    public static void main(String[] args) {
        //배열 만들기 (정적배열) 관리 효율적
        String[] stringArray = new String[10];
        for(int i = 0; i <10; i++){
            stringArray[i] = "배열 " + String.valueOf(i);
        }
        for(int i = 0; i <10; i++){
            System.out.println(i + " 번 : "+ stringArray[i]);
        }

        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i * 10;
        }
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
//        동적배열 - 크기 정하지 않음
        ArrayList<String> StringArrayList = new ArrayList<>();
        StringArrayList.add("안녕하세요.");
        StringArrayList.add("동동이 입니다.");
        StringArrayList.add("안녕하세요.");
        StringArrayList.add("문도박사 입니다.");

        System.out.println(StringArrayList.get(0));

        for (int i = 0; i < StringArrayList.size(); i++){
            System.out.println(StringArrayList.get(i));
        }

        StringArrayList.set(2, "반갑습니다."); // 데이터 수정
        for (int i = 0; i < StringArrayList.size(); i++){
            System.out.println(StringArrayList.get(i));
        }

        StringArrayList.remove(3); // 데이터 삭제
        for (int i = 0; i < StringArrayList.size(); i++){
            System.out.println(StringArrayList.get(i));
        }
    }
}
