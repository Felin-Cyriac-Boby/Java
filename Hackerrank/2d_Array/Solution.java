import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
            int max_count = -63;
            for (int i = 1;i<5;i++) {
                for (int j=1;j<5;j++) {
                    int current_count = arr[i][j] + arr[i-1][j-1] + arr[i-1][j]+ arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                    
                    if (current_count > max_count) {
                            max_count = current_count;
                    }
                  
                }
            }
            return max_count;
    }
    public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] arr = new int[6][6];
            for (int i = 0;i<6;i++) {
                for(int j=0;j<6;j++) {
                    arr[i][j] = scan.nextInt();
                    
                }
            }
            scan.close();
            System.out.print(hourglassSum(arr));
    }
    
}
