

public class StringConcat {
    public static void main(String[] args){
        String name="java programing";
        System.out.println("Length : " +name.length());
        //charAt -> to find specific character
        char ch  =name.charAt(1);
        System.out.println("character : "+ch);
        //checking starting index and ending index  were ending index should be +1
        String subStr=name.substring(0,4);
        System.out.println("substring: " +subStr);
        //to uppercase
        System.out.println("upper case : "+name.toUpperCase());
        //to lowercase
        System.out.println("lower case : "+name.toLowerCase());
        //compare
        String str="rahul";
        boolean isSame=str.equals("Rahul");
        System.out.println("boolean :"+isSame);
        boolean isSameCase=str.equalsIgnoreCase("rahul");
        System.out.println("without case sensitive: "+isSameCase);
        //to check a substring contains by the string
        System.out.println("<java> contains: "+str.contains("rahul"));
        //to replace substring or  char
        System.out.println("Replace pyhton: "+name.replace("java","python"));

    }
    
}
