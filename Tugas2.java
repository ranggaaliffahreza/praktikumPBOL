import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Kelas untuk menyimpan data mahasiswa
class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}

// Kelas untuk manajemen mahasiswa
public class tugas_2 {
    private Map<String, Mahasiswa> mahasiswaMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int pilihan;
        do {
            System.out.println("\n=== Pilih Opsi ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (pilihan) {
                case 1:
                    createMahasiswa();
                    break;
                case 2:
                    readMahasiswa();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    private void createMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        if (mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar! Silakan gunakan NIM lain.");
            return;
        }
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        mahasiswaMap.put(nim, new Mahasiswa(nama, nim));
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    private void readMahasiswa() {
        if (mahasiswaMap.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        System.out.println("\n=== Daftar Mahasiswa ===");
        for (Mahasiswa m : mahasiswaMap.values()) {
            System.out.println(m);
        }
    }

    private void updateMahasiswa() {
        System.out.print("Masukkan NIM yang ingin diupdate: ");
        String nim = scanner.nextLine();
        if (!mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM tidak ditemukan!");
            return;
        }
        
        System.out.print("Masukkan Nama baru: ");
        String namaBaru = scanner.nextLine();
        mahasiswaMap.put(nim, new Mahasiswa(namaBaru, nim));
        System.out.println("Data mahasiswa berhasil diupdate!");
    }

    private void deleteMahasiswa() {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nim = scanner.nextLine();
        if (!mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM tidak ditemukan!");
            return;
        }
        
        mahasiswaMap.remove(nim);
        System.out.println("Data mahasiswa berhasil dihapus!");
    }

    public static void main(String[] args) {
        tugas_2 app = new tugas_2();
        app.menu();
    }
}
