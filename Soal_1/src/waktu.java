public class waktu {

    public int jam;
    public int menit;
    public int detik;

    public waktu (int jam, int menit, int detik) {
        this.jam = (jam >= 0 && jam <= 23) ? jam : 0;
        this.menit = (menit >= 0 && menit <= 59) ? menit : 0;
        this.detik = (detik >= 0 && detik <= 59) ? detik : 0;
    }

    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    public void cetakWaktu() {
        System.out.println("Waktu saat ini: " + jam + ":" + menit + ":" + detik);
    }

    public static void main(String[] args) {
        waktu waktu = new waktu(19, 49, 0);
        waktu.cetakWaktu();
    }
}