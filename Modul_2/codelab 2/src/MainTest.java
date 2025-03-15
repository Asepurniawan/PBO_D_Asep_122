
public class MainTest {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.namaPemilik = "Asep Kurniawan";
        rekening2.namaPemilik = "Ivan Nurnyanyo";

        rekening1.nomorRekening = "202410370110122";
        rekening2.nomorRekening = "202410370110156";

        rekening1.saldo = 1000000.0;
        rekening2.saldo = 1000000.0;

        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);
        System.out.println();

        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);
        System.out.println();

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}
