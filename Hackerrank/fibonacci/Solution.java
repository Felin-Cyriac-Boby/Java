import java.util.*;

public class Solution {
    
    static int[] memo;
    public static int fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        if (memo[n]==0) {
            memo[n] = fibonacci(n-1) + fibonacci(n-2);
        }
        return memo[n];
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        memo = new int[n+1];
        System.out.println(fibonacci(n));
    }
}