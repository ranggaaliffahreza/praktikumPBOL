import java.util.Scanner;

public class tugas1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.println("\nOutput:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        
        scanner.close();
    }
}