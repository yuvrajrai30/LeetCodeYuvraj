import java.util.Scanner;

public class pivotIndex {
    public static int pivot(int[] nums) {
        int lsum=0;
        int rsum=0;
        for(int i=0;i<nums.length;i++)
        {
            lsum=0;
            rsum=0;
            for(int j=0;j<i;j++)
            {
                lsum+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++)
            {
                rsum+=nums[k];
            }
            if(lsum==rsum)
            {
                return i;
            }
            
                

        }
        return -1;
        
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
        System.out.println("pivot index : "+pivot(nums));

    }
    
}
