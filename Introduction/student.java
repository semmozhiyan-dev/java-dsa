import java.util.Scanner;

    class Student{
    String name="";
    int roll=0;
    int age=0;    
    public void study(){

            System.out.println(name + " is studying");
        }            
    public void exam(){
            System.out.println(name + " is  writingexam");                    
    }
}
public class student {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        s1.name="Alice";
        s1.exam();
        s1.study();
        Student s2=new Student();
        s2.name="Bob";
        s2.exam();
        s2.study();
        sc.close();

        



    }

}
