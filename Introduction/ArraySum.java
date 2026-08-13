import java.util.Scanner;
public class ArraySum {
    public static void printArray(String names[]){
        System.out.println("Array elements are: ");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args){
        
        /*//type 1
        int size=5;
        int [] nums=new int[size];
        nums[0]=56;
        nums[1]=67;
        nums[2]=80;
        nums[3]=89;
        nums[4]=78;
        for(int i=0;i<size;i++){
            System.out.println(nums[i]);
        }
            */

        //type 2
        /*int marks[]={89,69,87,45,86};
        int len =marks.length;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
*/         
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int size=sc.nextInt();
        String names[]=new String[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }
        printArray(names);

        

    }
    
}
