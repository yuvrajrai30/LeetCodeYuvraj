import java.util.Arrays;
import java.util.Scanner;

class moveZero {
    public static void moveZeroes(int[] nums) {
        if(nums.length==1){
            System.out.println(Arrays.toString(nums));
        }
        else{
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i;j<nums.length;j++)
                    {
                        if(nums[i]==0)
                        {
                            nums[i]=nums[j];
                            nums[j]=0;
                        }
                    }
            }
            System.out.println(Arrays.toString(nums));
        }
        
        
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
        moveZeroes(nums);

    }
}