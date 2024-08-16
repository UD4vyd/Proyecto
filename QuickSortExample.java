import java.util.Scanner;

public class QuickSortExample {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Solicitar al usuario que ingrese los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Ordenar el arreglo usando Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }

    // Método para realizar el Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Ordenar las particiones
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Método para encontrar el índice de partición
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar arr[i + 1] y arr[high] (o pivote)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
