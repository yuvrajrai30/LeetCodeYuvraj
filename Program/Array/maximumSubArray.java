import java.util.Arrays;
import java.util.Scanner;

public class maximumSubArray {
    public static int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int[] subarr = Arrays.copyOfRange(nums, i, j+1);
                for(int z=0;z<subarr.length;z++)
                {
                    sum+=subarr[z];
                }
                if(maxsum<sum)
                {
                    maxsum=sum;
                }
                sum=0;
            }
        }
        return maxsum;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int a = 0;a<l;a++)
        {
            System.out.println("Enter a number");
            nums[a]=sc.nextInt();
        }
        int soln = maxSubArray(nums);
        System.out.println("solution : "+soln);
    }
}