import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> mahasiswaMap = new HashMap<>();
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\nPilih Opsi :");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Baca Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Menghindari masalah dengan nextLine()

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    if (mahasiswaMap.containsKey(nim)) {
                        System.out.println("NIM sudah terdaftar.");
                    } else {
                        System.out.print("Masukkan Nama: ");
                        String nama = scanner.nextLine();
                        mahasiswaMap.put(nim, nama);
                        System.out.println("Mahasiswa berhasil ditambahkan.");
                    }
                    break;

                case 2:
                    if (mahasiswaMap.isEmpty()) {
                        System.out.println("Data mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Map.Entry<String, String> entry : mahasiswaMap.entrySet()) {
                            System.out.println("NIM: " + entry.getKey() + " | Nama: " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM untuk diupdate: ");
                    nim = scanner.nextLine();
                    if (mahasiswaMap.containsKey(nim)) {
                        System.out.print("Masukkan Nama baru: ");
                        String namaBaru = scanner.nextLine();
                        mahasiswaMap.put(nim, namaBaru);
                        System.out.println("Data mahasiswa berhasil diupdate.");
                    } else {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan NIM untuk dihapus: ");
                    nim = scanner.nextLine();
                    if (mahasiswaMap.containsKey(nim)) {
                        mahasiswaMap.remove(nim);
                        System.out.println("Mahasiswa berhasil dihapus.");
                    } else {
                        System.out.println("NIM tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
