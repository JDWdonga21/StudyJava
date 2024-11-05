import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수를 입력받음
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        // 최대공약수를 구함
        int gcd = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        // 최소공배수를 구함
        int lcm = a * b / gcd;

        // 결과를 출력
        System.out.println("최대공약수: " + gcd);
        System.out.println("최소공배수: " + lcm);
        
        scanner.close();
    }
}
