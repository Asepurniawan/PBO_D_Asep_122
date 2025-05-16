import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        // Data awal untuk pengujian
        daftarBarang.add(new Barang("Pensil", 50));
        daftarBarang.add(new Barang("Buku", 30));
        daftarBarang.add(new Barang("Penghapus", 20));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            int opsi;
            try {
                opsi = scanner.nextInt();
                scanner.nextLine(); // konsumsi newline
            } catch (InputMismatchException e) {
                System.out.println("Input opsi harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            if (opsi == 1) {
                // Tambah Barang Baru
                System.out.print("Masukkan nama barang: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan stok awal: ");
                try {
                    int stok = scanner.nextInt();
                    scanner.nextLine();
                    daftarBarang.add(new Barang(nama, stok));
                    System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
                } catch (InputMismatchException e) {
                    System.out.println("Input stok harus berupa angka!");
                    scanner.nextLine();
                }
            } else if (opsi == 2) {
                // Tampilkan Semua Barang
                if (daftarBarang.isEmpty()) {
                    System.out.println("Stok barang kosong.");
                } else {
                    System.out.println("--- Daftar Barang ---");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        Barang b = daftarBarang.get(i);
                        System.out.println(i + ". Nama: " + b.getNama() + ", Stok: " + b.getStok());
                    }
                    System.out.println("----------------------");
                }
            } else if (opsi == 3) {
                // Kurangi Stok Barang
                if (daftarBarang.isEmpty()) {
                    System.out.println("Stok barang kosong.");
                    continue;
                }
                
                // Tampilkan semua barang untuk pemilihan
                System.out.println("--- Daftar Barang ---");
                for (int i = 0; i < daftarBarang.size(); i++) {
                    Barang b = daftarBarang.get(i);
                    System.out.println(i + ". Nama: " + b.getNama() + ", Stok: " + b.getStok());
                }
                System.out.print("Pilih nomor barang yang ingin dikurangi stoknya: ");
                int idx;
                try {
                    idx = scanner.nextInt();
                    scanner.nextLine();
                    if (idx < 0 || idx >= daftarBarang.size()) {
                        System.out.println("Nomor barang tidak valid!");
                        continue;
                    }
                    Barang barangDipilih = daftarBarang.get(idx);
                    System.out.print("Masukkan jumlah pengurangan stok: ");
                    int jumlahKurang = scanner.nextInt();
                    scanner.nextLine();
                    if (jumlahKurang < 0) {
                        System.out.println("Jumlah pengurangan tidak boleh negatif!");
                        continue;
                    }
                    if (jumlahKurang > barangDipilih.getStok()) {
                        System.out.println("Stok tidak mencukupi!");
                        continue;
                    }
                    barangDipilih.setStok(barangDipilih.getStok() - jumlahKurang);
                    System.out.println("Stok barang '" + barangDipilih.getNama() + "' berhasil dikurangi.");
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka!");
                    scanner.nextLine();
                }
            } else if (opsi == 0) {
                System.out.println("Terima kasih telah menggunakan aplikasi manajemen stok.");
                break;
            } else {
                System.out.println("Opsi tidak valid!");
            }
        }
        scanner.close();
    }
}
