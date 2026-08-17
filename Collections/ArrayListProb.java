import java.util.ArrayList;
public class ArrayListProb {
    public static void main(String[] args){
        //Declare arraylist->string
        ArrayList<String> list=new ArrayList<>();
        //add() -> to store the element or to insert the element end of the array
        list.add("is");
        list.add("a");
        //addFirst()-> to add the element first of ArrayList
        list.addFirst("Semmozhiyan");
        //addLast()-> to add the element last of ArrayList
        list.addLast("Talented Guy");   
        //set-> to replace an element in a specific index position
        list.set(3,"smart");
        //add(index,element)-> insert an element a specific index
        list.add(2,"also");
        //get(index)-> to retrive an element of a specific element
        System.out.println("retrive element are: "+ list.get(2));
        
        System.out.println("list: "+list);

    }
    
}
