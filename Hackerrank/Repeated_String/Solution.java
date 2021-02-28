import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        
        long count = 0;
        int len = s.length();
        int mod = (int)( n % (long)len);
        //System.out.println(mod);
        boolean modCheck = mod == 0;
        int modCount = 0;
        for (long n_count = 0; n_count < n; n_count++) {
            if ((int)n_count == mod ) {
                modCount = (int) count;
            }
            if ((int)n_count == len) {
                if (count == 0) {
                    return 0;
                }
                else if ((int)count == len) {
                    return n;
                }
                else {
                    long div = n/(long) len;
                    //System.out.println(count*div);
                    //System.out.println(modCount);
                    return count*div + (long) modCount;
                }
            }
            if (s.charAt((int)n_count%len)=='a') {
                count += 1;
            }
        }
        return count;
    }

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        long n = scan.nextLong();
        scan.close();
        System.out.println(repeatedString(s,n));
    }
}
