public class SieveAlgo {
    public static void findPrimes(int num){
        boolean prime []=new boolean[num+1];
        for(int i=2;i*i<num;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=num;j+=i){
                    prime[j]=true;
                }
            }
        }
    }
    public static void main(String[] args){
        int num=30;
    }
    
}
