public class Inheritence {
    class Animal{
       void sound(){
            System.out.println("Animal makes sound");
        }
    }
    class Dog xtends Animal(){
        void sound(){
        System.out.println("dog barks");
}
class cat extends Animal(){
    void sound(){
        System.out.println("cat meows");
    }
}
    public static void main(String[] args){
        dog n1=new dog();
        cat n2=new cat();
        n1.sound();
    }
}



