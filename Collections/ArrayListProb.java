import java.util.ArrayList;
public class ArrayListProb {
    public static void main(String[] args){
        //Declare arraylist->string
        ArrayList<String> list=new ArrayList<>();
        //add() -> to store the element or to insert the element end of the array
        list.add("is");
        list.add("a");
        list.addLast("Talent Guy");
     //addFirst()-> to add the element front of ArrayList
        list.addFirst("He");
     
        System.out.println("list: "+list);
    }
    
}
