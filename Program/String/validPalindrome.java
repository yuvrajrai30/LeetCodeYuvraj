package String;

import java.util.Scanner;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String cleanedString = sb.toString();
        String reversedString = sb.reverse().toString();
        return cleanedString.equals(reversedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    
    }
}
