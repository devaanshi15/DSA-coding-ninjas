//extracting last index of x

public class p7 {

    public static int lastIndex(int a[], int x, int si) {
        if (si == a.length)     //empty array
            return -1;

        int k=lastIndex(a, x, si+1);

        if(k!=-1)
            return k;

        else{
            if(a[si]==x)
                return si;
            else    
                return -1;
        }

    }

    public static void main(String[] args) {
        int[] array = { 1, 8, 3, 1, 5, 3 , 2, 1, 1 };
        System.out.println(lastIndex(array, 1, 0));
    }
    
}
