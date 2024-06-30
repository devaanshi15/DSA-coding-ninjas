public record p12() {
    public static int binaryS(int a[], int si, int ei, int x){
        if(si>ei)
            return -1;

        int mi= (si+ei)/2;

        if(a[mi]==x)
            return mi;
        else if(x>a[mi])
            return binaryS(a, mi+1, ei, x);
        else
            return binaryS(a, mi-1, ei, x);
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,4,10, 100,203};
        System.out.println(binaryS(a, 0, a.length-1, 100));
    }
}
