
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char[] string = (input.nextLine()).toCharArray();
        input.close();
        System.out.println(isPallindrome(string) ? "Yes" : "NO");
    }

    static boolean isPallindrome(char[] string) {
        if (string.length == 1) {
            return true;
        }
        int start = 0, end = (string.length - 1);
        while (start < end) {
            if (string[start] != string[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}