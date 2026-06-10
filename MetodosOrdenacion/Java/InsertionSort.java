public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int llave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > llave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = llave;
        }
    }

    public static void main(String[] args) {
        int[] datos = {5, 2, 4, 6, 1, 3};
        insertionSort(datos);
        System.out.print("Resultado: ");
        for (int n : datos) System.out.print(n + " ");
        // [1, 2, 3, 4, 5, 6]
    }
}
