public class Condn {
    public static void main(String[] args) {
        int age=70;
        //true
        if(age>=18){
            System.out.println("Adult");
            if(age>=60){
            System.out.println("old");
        }
        }        
        //false
        else{
            System.out.println("Minor");
            if(age<=10){
                System.out.println("child");
            }
        }
    }    
}
