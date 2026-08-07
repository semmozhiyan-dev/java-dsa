public class Condn {
    public static void main(String[] args) {
        /* 
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
            */
           //nested if else
        int age=70;
        if(age<=3){
            System.out.println("baby");
        }else if(age>3 && age<=12){
            System.out.println("child");
        }else if(age>12 && age<=18){
            System.out.println("teenager");
        }else if(age>19 && age<=60){
            System.out.println("adult");
        }else{
            System.out.println("old");
        }  

















    }    
}
