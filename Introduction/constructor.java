//default constructor
public class constructor {
        String name;
        constructor(){
            System.out.println("Constructor is called");

        }
    public static void main(String[] args){
        constructor s=new constructor();
        parconstructor s1=new parconstructor("bob");
        parconstructor s2=new parconstructor(s1.name);
        parconstructor s3=new parconstructor("bob",20);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
//parameterized constructor
class parconstructor{
            String name;
            parconstructor(String name){
                System.out.println("Parent constructor is called");

            }  
            parconstructor(parconstructor s1){
                System.out.println("Parent constructor is called");
                
            }
            //constructor overloading
            parconstructor(String name,int age){
                System.out.println("Parent constructor is called");
                this.name=name;
            }

        }
