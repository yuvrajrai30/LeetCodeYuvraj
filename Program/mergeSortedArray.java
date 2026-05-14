import java.util.Arrays;
import java.util.Scanner;

public class mergeSortedArray
{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array1");
        int l = sc.nextInt();
        int nums1[] = new int[l];
        for(int a = 0;a<l;a++)
        {
            System.out.println("Enter a number in ascending order");
            nums1[a]=sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the length of an array2");
        int m = sc.nextInt();
        int nums2[] = new int[l];
        for(int a = 0;a<l;a++)
        {
            System.out.println("Enter a number in ascending order");
            nums2[a]=sc.nextInt();
        }
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        merge(nums1,x,nums2,y);
        System.out.println("missing number : "+Arrays.toString(nums1));

    }
}