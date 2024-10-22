import java.util.Scanner;

public class Triangle18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        int i = 0;
        while (i < N) {  // Change condition to i < N to print N rows
            int j = 0;
            while (j <= i) {  // Change condition to j <= i to print the correct number of stars
                System.out.print("*");
                j++;
            }
            System.out.println();  // Print a new line after each row
            i++;
        }
        
        sc.close();  // Close the scanner to prevent resource leaks
    }
}