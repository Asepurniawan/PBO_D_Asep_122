public class Status_banjir {
    // Atribut
    private String status;
    private int tinggi_banjir; // Changed variable name to follow Java naming conventions

    // Konstruktor
    public Status_banjir(int tinggi_banjir) {
        this.tinggi_banjir = tinggi_banjir;
        check_status(); // Memanggil metode check_status saat objek dibuat
    }

    // Metode untuk memeriksa status banjir
    public void check_status() {
        if (tinggi_banjir >= 0 && tinggi_banjir <= 25) {
            status = "Aman";
        } else if (tinggi_banjir >= 26 && tinggi_banjir <= 50) {
            status = "Siaga I";
        } else if (tinggi_banjir >= 51 && tinggi_banjir <= 100) {
            status = "AWAS";
        } else {
            status = "Tinggi banjir tidak valid";
        }
    }

    // Metode untuk menampilkan atribut
    public void show_attributes() { // Changed method name to follow Java naming conventions
        System.out.println("Tinggi Banjir: " + tinggi_banjir);
        System.out.println("Status: " + status);
    }

    // Main method untuk menguji kelas
    public static void main(String[] args) {
        // Membuat objek dari kelas Status_banjir
        Status_banjir banjir1 = new Status_banjir(20);
        banjir1.show_attributes();

        Status_banjir banjir2 = new Status_banjir(30);
        banjir2.show_attributes();

        Status_banjir banjir3 = new Status_banjir(60);
        banjir3.show_attributes();
    }
}