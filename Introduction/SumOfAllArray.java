public class SumOfAllArray {
    public static void SumOfAllArrayCheck(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all elements in the array is: " + sum);
    }
    public static void main(String[] args){
        int n=5;
        int [] nums={2,5,1,3,-1};
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        SumOfAllArrayCheck(nums);
    }
    
}
