import java.util.Arrays;
import java.util.Scanner;

public class missingNo {
    public static int missingNumber(int[] nums) {
        int soln =0;
        int c=0;
        int l=0;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        for(int i=min;i<=max;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==i)
                { 
                    c=1;
                    
                }
            }
            if(c==0)
            {
                soln = i;
                break;
            }
            else
            {
                c=0;
                l++;
            }
        }
        if(l==nums.length)
        {
            if(min==0){
                soln=nums[nums.length-1]+1;
            }
            else
            {
                soln=nums[0]-1;
            }
            
        }
        return soln;
        
    }
    public static void main(String args[])
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
        System.out.println("missing number : "+missingNumber(nums));

    }
}
