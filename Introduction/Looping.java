public class Looping{
    public static void main(String[] args){
        /*int n=10;
        for(int i=1;i<=n;i++){
            System.out.println("Hello World");
        }*/
       /*int n=10;
       int sum=0;
       for(int i=1;i<=n;i++){
           sum=sum+i;
       }
       System.out.println("Sum: " + sum);
*/
       for(int i=1;i<=5;i++){
           for(int j=1;j<=4;j++){
               System.out.println("i= "+i+ " j= "+j);
           }
           System.out.println();
        }

    }
}