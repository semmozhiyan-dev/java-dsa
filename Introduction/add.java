//with return type and without arguments
public class add {
    public int addValues(){
        int a=5;
        int b=10;
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args){
        add obj=new add();
        int res=obj.addValues();
        System.out.println(res);
    }
    
}
