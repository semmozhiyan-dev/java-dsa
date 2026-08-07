import java.util.Scanner;
class PrintAverage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        float num1=sc.nextFloat();
        System.out.println("Enter the second number:");
        float num2= sc.nextFloat();
        float sum=num1+num2;
        float average=sum/2;
        System.out.printf("The average is: %.2f", average);
        sc.close();
    }
}
