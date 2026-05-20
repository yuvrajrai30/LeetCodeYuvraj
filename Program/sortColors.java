import java.util.Arrays;
import java.util.Scanner;

public class sortColors {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int a = 0;a<l;a++)        {
            System.out.println("Enter a number");
            nums[a]=sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("sorted array : "+Arrays.toString(nums));
    }
    
}
