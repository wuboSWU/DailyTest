package problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        String text = strin.readLine();
        String[] s = text.split(",");
        String str = longestCommonPrefix(s);
        System.out.println(str);
    }

    public static String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        if (min == 0) {
            return null;
        }
        int flag = -1;
        boolean f = true;
        for (int j = 0; j < min; j++) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    f = false;
                    break;
                }
            }
            if (f) {
                flag++;
            } else {
                break;
            }
        }
        if (flag == -1) {
            return null;
        } else {
            return strs[0].substring(0, flag + 1);
        }
    }
}


