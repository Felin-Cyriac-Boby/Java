import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for (int i = 0;i<(c.length-3);i++) {
            if (c[i+2]==0) {
                count += 1;
                i += 1; 
            }
            else {
                count += 1; 
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+2];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        arr[n] = 0; 
        System.out.println(jumpingOnClouds(arr));
    }
}