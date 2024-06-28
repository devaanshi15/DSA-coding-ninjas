//Sum of n natural numbers


public class p2 {

    public static int sumN(int n){
        if(n==0){
            return 0;
        }

        int smallOP = sumN(n-1);
        int output = n + smallOP;
        return output;

    }

    public static void main(String args[]){
        System.out.println(sumN(3));
    }
    
}
