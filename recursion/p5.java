//checking if an array is sorted?


public class p5 {

    public static boolean sortCheck(int a[]){
        if(a.length == 1)
            return true;

        if(a[0] > a[1]) 
            return false;

        //copying array now
        int smallA[] = new int[a.length - 1];
        for(int i = 1; i < a.length; i++){
            smallA[i - 1] = a[i];
        }

        boolean isSmallArraySorted = sortCheck(smallA);
        return isSmallArraySorted;
    }


    public static boolean sortCheckBetter(int a[], int si){
        if(si==a.length-1)
            return true;

        if(a[si] > a[si+1])
            return false;

        boolean isSmallArraySorted = sortCheckBetter(a, si+1);
        return isSmallArraySorted;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 3, 4, 5}; // example array
        // System.out.println(sortCheck(array));

        System.out.println(sortCheckBetter(array, 0));
    }
}
