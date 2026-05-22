import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static int[] tSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();

        System.out.println("Enter the length of an array");
        int l = sc.nextInt();
        int nums[] = new int[l];

        for (int a = 0; a < l; a++) {
            System.out.println("Enter a number");
            nums[a] = sc.nextInt();
        }

        int[] soln = tSum(nums, target); 
        System.out.println("Solution: " + Arrays.toString(soln));
    }
}