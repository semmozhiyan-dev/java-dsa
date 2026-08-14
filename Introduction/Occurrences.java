import java.util.Scanner;
public class Occurrences {
    public static void OccElement(int[] arr){
        int num=arr.length;
        boolean[] visited=new boolean[num];
        for(int i=0;i<num;i++){
            if(visited[i]){
                continue;
            }
            int count=0;
            for(int j=0;j<num;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
              }
            System.out.println("The Occurrences of " + arr[i] + " is: " + count);
            visited[i]=true;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i]=sc.nextInt();
        }
    OccElement(arr);
    sc.close();
    }
    
    
}
