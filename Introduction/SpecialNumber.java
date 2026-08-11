import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        System.out.println("Enter the value 2: ");
        int m=sc.nextInt();
        int sum;
        int product;
        int result;
        int digit_1;
        int digit_2;
        System.out.println("The special numbers are: ");
        for(int i=n;i<=m;i++){
            digit_1=i%10;
            digit_2=i/10;
            sum=digit_1+digit_2;
            product=digit_1*digit_2;
            result=sum+product;
            if(result==i){
                System.out.println (i);
            }
        }
    }
    
}
