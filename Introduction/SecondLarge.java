import java.util.*;
public class SecondLarge {
    public static void SecondLargeCheck(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        int secondMax=0;
            
        for(int j=0;j<arr.length;j++){
            if(arr[j]>secondMax && arr[j]<max){
                secondMax=arr[j];
                 
            }
        }
        System.out.println("Second largest element is: " + secondMax);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        SecondLargeCheck(nums);
    }
    
}
