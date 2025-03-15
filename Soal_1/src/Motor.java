public class Motor {
    // Atribut kelas
    private String aktivitas;
    private int kecepatan;

    // Constructor
    public Motor(int kecepatan) {
        this.kecepatan = kecepatan;
        cekKecepatan();
    }

    // Method untuk cek kecepatan
    public void cekKecepatan() {
        if (kecepatan == 0) {
            aktivitas = "parkir";
        } else if (kecepatan == 1) {
            aktivitas = "berjalan";
        }
    }

    // Method untuk mencetak semua nilai atribut
    public void cetakAtribut() {
        System.out.println("Aktivitas : " + aktivitas);
        System.out.println("Kecepatan : " + kecepatan);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Motor dengan kecepatan 0
        Motor motor1 = new Motor(0);
        motor1.cetakAtribut();

        // Membuat objek Motor dengan kecepatan 1
        Motor motor2 = new Motor(1);
        motor2.cetakAtribut();
    }
}