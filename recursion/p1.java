public class p1 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        int smallOP = factorial(n-1);
        int output = n*smallOP;
        return output;

    }

    public static void main(String args[]){
        System.out.println(factorial(3));
    }
    
}
