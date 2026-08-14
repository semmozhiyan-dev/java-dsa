import java.util.*;
public class ReverseArray {
    public static void RevereseArrayCheck(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size Of An Array: ");
        int n=sc.nextInt();
        System.out.println("Enter The Elements Of An Array: ");

        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();           
        }
        System.out.println("The Elements Of An Array Are: ");
        RevereseArrayCheck(nums);
    }    
}
