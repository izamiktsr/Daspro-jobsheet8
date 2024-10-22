import java.util.Scanner;

public class RataNilai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Outer loop for 5 students
        int i = 1;
        while (i <= 5) {
            // Inner loop for 5 grades per student
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }

            // Calculate average grade
            double rataNilai = (double) totalNilai / 5;

            // Print the results for each student
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);

            i++;
        }

        sc.close();
    }
}