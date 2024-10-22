import java.util.Scanner;

public class PersegiAngka318 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            // Menampilkan angka 5 di baris pertama dan terakhir
            for (int i = 1; i <= N; i++) {
                System.out.print("3 ");
            }
            System.out.println();

            // Menampilkan angka 5 di kolom pertama dan terakhir
            for (int i = 1; i <= N - 2; i++) {
                System.out.print("3 ");
                for (int j = 1; j <= N - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println("3");
            }

            // Menampilkan angka 5 di baris terakhir
            for (int i = 1; i <= N; i++) {
                System.out.print("3 ");
            }
            System.out.println();
        }
    }
}