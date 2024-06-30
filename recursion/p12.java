//merge sort

public record p12() {

    public static void merge(int s1[], int s2[], int finalA[]) {
        int i = 0, j = 0, k = 0;

        while (i < s1.length && j < s2.length) {

            // if s1's first element is <= s2's first element, then it's going in the final array
            if (s1[i] <= s2[j]) {
                finalA[k] = s1[i];
                i++;
            } else {
                finalA[k] = s2[j];
                j++;
            }
            k++;
        }

        // s1 array elements still left
        while (i < s1.length) {
            finalA[k] = s1[i];
            i++;
            k++;
        }

        // or s2 array elements still left
        while (j < s2.length) {
            finalA[k] = s2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int a[]) {
        if (a.length <= 1)
            return;
        int b[] = new int[a.length / 2];
        int c[] = new int[a.length - b.length];

        // copying elements in b
        for (int i = 0; i < a.length / 2; i++) {
            b[i] = a[i];
        }

        // copying elements in c
        for (int i = a.length / 2; i < a.length; i++) {
            c[i - a.length / 2] = a[i];
        }

        mergeSort(b);
        mergeSort(c);

        merge(b, c, a);
    }

    public static void main(String[] args) {
        int a[] = {10, 4, 5, 3, 1, 50, 100, 31};
        mergeSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
