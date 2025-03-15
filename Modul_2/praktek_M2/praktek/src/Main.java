import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();
        plant plant1 = new plant();
        plant plant2 = new plant();

        farmer1.nama = "budi";
        farmer2.nama = "agus";
        plant1.nama = "kecubung";
        plant2.nama = "jamur";

        farmer1.favourit = plant1.nama;
        farmer2.favourit = plant2.nama;


        System.out.println("hello, world!");
        System.out.println("current date and time:" + new Date());

        farmer1.talk();
        farmer2.talk();
        }
    }
