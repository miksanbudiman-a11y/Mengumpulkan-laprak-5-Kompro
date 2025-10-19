import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = {1, 2, 3, 4, 5, 6};

        System.out.print("Masukkan jumlah rotasi ke kanan (k): ");
        int k = scanner.nextInt();

        int n = data.length;
        k = k % n;

        reverse(data, 0, n - 1);
      
        reverse(data, 0, k - 1);
    
        reverse(data, k, n - 1);

        System.out.print("Array setelah rotasi: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
