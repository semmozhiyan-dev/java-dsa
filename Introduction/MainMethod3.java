//with returntype and without arguments
public class MainMethod3 {
     public int addValues(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        MainMethod3 obj =new MainMethod3();
        int res=obj.addValues(8,9);
        System.out.println(res);
    }
}
