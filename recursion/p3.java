//print 1......n

public class p3 {

    public static void naturalNos(int n){
        if(n==0)
            return;
        naturalNos(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        naturalNos(10);
    }
    
}
