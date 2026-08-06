import java.util.Scanner;
class Student{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name: " );
        String name =sc.nextLine();
        System.out.println("enter the roll number: ");
        int num =sc.nextInt();
        System.out.println("enter the age: ");
        int age =sc.nextInt();
        System.out.println("enter the department: ");
        String department =sc.nextLine();
        System.out.println("enter the cgpa: ");
        float cgpa =sc.nextFloat();
        System.out.println("entered name: "+name);
        System.out.println("entered roll number: "+num);
        System.out.println("entered age: "+age);    
        System.out.println("entered department: "+department);
        System.out.println("entered cgpa: "+cgpa);
    }
}