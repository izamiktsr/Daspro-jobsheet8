import java.util.Scanner;

public class Porseni18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[][] badminton = new String[5][2]; 
        String[][] tenisMeja = new String[5][2];
        String[][] basket = new String[5][2];
        String[][] bolaVoly = new String[5][2];
        
        
        System.out.println("PENDAFTARAN ATLET PORSENI 2024");
        System.out.println("===============================");
        
        System.out.println("\nCABANG BADMINTON:");
        for(int i = 0; i < 5; i++) {
            System.out.println("\nAtlet ke-" + (i+1));
            System.out.print("Nama Atlet: ");
            badminton[i][0] = sc.nextLine();
            System.out.print("Asal Politeknik: ");
            badminton[i][1] = sc.nextLine();
        }
        
        System.out.println("\nCABANG TENIS MEJA:");
        for(int i = 0; i < 5; i++) {
            System.out.println("\nAtlet ke-" + (i+1));
            System.out.print("Nama Atlet: ");
            tenisMeja[i][0] = sc.nextLine();
            System.out.print("Asal Politeknik: ");
            tenisMeja[i][1] = sc.nextLine();
        }
        

        System.out.println("\nCABANG BASKET:");
        for(int i = 0; i < 5; i++) {
            System.out.println("\nAtlet ke-" + (i+1));
            System.out.print("Nama Atlet: ");
            basket[i][0] = sc.nextLine();
            System.out.print("Asal Politeknik: ");
            basket[i][1] = sc.nextLine();
        }
        
       
        System.out.println("\nCABANG BOLA VOLY:");
        for(int i = 0; i < 5; i++) {
            System.out.println("\nAtlet ke-" + (i+1));
            System.out.print("Nama Atlet: ");
            bolaVoly[i][0] = sc.nextLine();
            System.out.print("Asal Politeknik: ");
            bolaVoly[i][1] = sc.nextLine();
        }
        
        System.out.println("\n\nDAFTAR ATLET PORSENI 2024");
        System.out.println("==========================");
        
        System.out.println("\nCABANG BADMINTON:");
        for(int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + badminton[i][0] + " - " + badminton[i][1]);
        }
        
        System.out.println("\nCABANG TENIS MEJA:");
        for(int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + tenisMeja[i][0] + " - " + tenisMeja[i][1]);
        }
        
        System.out.println("\nCABANG BASKET:");
        for(int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + basket[i][0] + " - " + basket[i][1]);
        }
        
        System.out.println("\nCABANG BOLA VOLY:");
        for(int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + bolaVoly[i][0] + " - " + bolaVoly[i][1]);
        }
        }
}
