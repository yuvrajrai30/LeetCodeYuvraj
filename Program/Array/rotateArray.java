import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class rotateArray {
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] n1= new int[k];
        int z=(nums.length-k);
        int[] n2= new int[z];
        n1=Arrays.copyOfRange(nums,z,nums.length);
        n2=Arrays.copyOfRange(nums,0,z);
        int[] r = IntStream.concat(Arrays.stream(n1),Arrays.stream(n2)).toArray();
        System.arraycopy(r,0,nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the occurance of rotation");
        int k=sc.nextInt();
        System.out.println("Enter the length of an array");
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int a = 0;a<l;a++)
        {
            System.out.println("Enter a number");
            nums[a]=sc.nextInt();
        }
        rotate(nums,k);
    }
}
