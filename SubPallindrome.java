import java.util.*;

public class SubPallindrome {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char[] string = (input.nextLine()).toCharArray();
        substr(string); 
        input.close();
    }

    static void substr(char[] string){
        System.out.println();
        String longestSubString = "";
        int longestLength = 0;

        for(int i=0;i<string.length;i++){
            String t = "" + string[i];
            for(int j=i+1;j<string.length;j++){
                t += string[j];
                if (isPallindrome(t.toCharArray())) {
                    if(longestLength < (j-i)){
                        longestLength = j-i;
                        longestSubString = t;
                    }
                }
            }
        }
        if(longestLength >0){
            System.out.println("Longest Pallindrome : \n" + longestSubString);
        }
        else {
            System.out.println("No Pallindrome Found");
        }
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