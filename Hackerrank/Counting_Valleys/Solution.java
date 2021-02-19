import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int countingValleys(int steps, String path) {
        int level = 0;
        boolean track = false;
        int count = 0;
        for (int i = 0; i < path.length(); i++) {
            char s = path.charAt(i);
            if (s == 'U') {
                level += 1;
            }
            else {
                level -= 1;
            }
            if (level < 0) {
                track = true;
            }
            if (track && (level == 0)) {
                count += 1;
                track = false;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = scan.nextInt();
        String path = scan.next();
        scan.close();
        Result sol = new Result();
        System.out.println(sol.countingValleys(steps,path));
    }
}