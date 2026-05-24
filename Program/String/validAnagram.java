package String;

import java.util.Arrays;
import java.util.Scanner;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s = sc.nextLine();
        System.out.println("Enter the second string:");
        String t = sc.nextLine();
        System.out.println(isAnagram(s,t));
    }
}
