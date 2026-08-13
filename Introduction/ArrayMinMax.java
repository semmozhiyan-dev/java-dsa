import java.util.Scanner;
public class ArrayMinMax {
    //method to find minimum
    public static void Min(int arr[]){
        int min=arr[0];        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum value is: "+min);
    }
    //method to find maximum
    public static void Max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value is: "+max);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //method to find minimum
        Min(arr);
        //method to find maximum
        Max(arr);
        sc.close();

    }
    
}
