import java.util.Scanner;

public class duplicateNumber {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
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
        System.out.println("duplicate number : "+findDuplicate(nums));
//19th May
    }
}
