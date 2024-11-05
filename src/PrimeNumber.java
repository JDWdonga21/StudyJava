import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int inputNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("소수의 갯수를 구할 숫자를 입력해주세요.");
        inputNum = sc.nextInt();
        PrimeNumber pn = new PrimeNumber();
        System.out.print(inputNum + "의 소수의 갯수는 ");
        System.out.println(pn.countPrimes(inputNum) + "개 입니다.");
        
        sc.close();
    }
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                for (int j = 2; i * j < n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}

