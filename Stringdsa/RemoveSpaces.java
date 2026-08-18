

public class RemoveSpaces{
    public static void main(String[] args){
    String  str ="how are you";
    String strReplace = str.replace(" ","");
    System.out.println("After removing spaces: "+ strReplace);
    // approach 2
    String newString="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=' '){
            newString+=str.charAt(i);   
        }    


    }
    System.out.println("After removing spaces: "+ newString);


}

    
}
