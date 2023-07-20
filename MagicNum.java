import java.util.Scanner;
public class MagicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(findNum(n) == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    static int findNum(int n) {
        int sum = 0;
        if(n/10 != 0) {
            while(n != 0) {
            sum += (n%10);
            n /= 10;
            }
            return findNum(sum);
        } else {
            return n;
        }
        
    }
}