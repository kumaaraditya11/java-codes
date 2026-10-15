public class quicksort {
    static void sort(int a[], int l, int h) {
        if (l < h) {
            int p = part(a, l, h);
            sort(a, l, p - 1);
            sort(a, p + 1, h);
        }
    }

    static int part(int a[], int l, int h) {
        int pivot = a[h], i = l - 1;
        for (int j = l; j < h; j++)
            if (a[j] <= pivot) {
                int t = a[++i]; a[i] = a[j]; a[j] = t;
            }
        int t = a[i + 1]; a[i + 1] = a[h]; a[h] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 8, 4, 2};
        sort(a, 0, a.length - 1);
        for (int x : a) System.out.print(x + " ");
    }
}