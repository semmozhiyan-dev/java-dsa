

public class StringConcat {
    public static void main(String[] args){
        String name="java Programming";
        System.out.println("Length : " +name.length());
        //charAt -> to find specific character
        char ch  =name.charAt(13);
        System.out.println("character : "+ch);
        //checking starting index and ending index  were ending index should be +1
        String subStr=name.substring(0,4);
        System.out.println("substring: " +subStr);

    }
    
}
