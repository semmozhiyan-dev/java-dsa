
import java.net.SocketTimeoutException;
import java.util.HashSet;
public class HashSetIntro {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(15);
        set.add(50);
        set.add(59);
        set.add(58);
        set.add(57);
        set.add(56);
        set.add(51);
        set.add(52);
        set.add(53);
        set.add(54);
        set.add(50);
        set.add(25);
        System.out.println("original set" +set);
        set.add(15);
        System.out.println("adding set" +set);
        System.out.println("is contains 15?" +set.contains(15));

    }
    
}
