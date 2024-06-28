//finding first index of occurance of x in the array

public class p6 {

    public static int firstIndex(int a[], int x, int si) {
        if (si == a.length)     //empty array
            return -1;

        if (a[si] == x)         //if first index only
            return si;

        int k = firstIndex(a, x, si + 1);   //else : 
        return k;

    }

    public static void main(String[] args) {
        int[] array = { 1, 8, 3, 4, 5, 3 };
        System.out.println(firstIndex(array, 3, 0));
    }

}
