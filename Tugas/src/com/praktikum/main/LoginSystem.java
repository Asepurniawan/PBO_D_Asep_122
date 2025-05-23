package com.praktikum.main;

import com.praktikum.users.*;
import com.praktikum.models.Item;
import java.util.*;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        userList.add(new Admin("Asep Kurniawan", "202410370110122", "admin122", "admin122"));
        userList.add(new Mahasiswa("Asep Kurniawan", "202410370110122"));
        userList.add(new Mahasiswa("Ivan Nuryanto", "202410370110146"));

        User user = null;
        while (user == null) {
            System.out.println("== SISTEM LOGIN ==");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Pilih jenis login (1/2): ");

            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                System.out.print("\nUsername: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                user = cariUser(username, password, true);
                if (user == null)
                    System.out.println("\nUsername atau password salah!\n");
            } else if (pilihan.equals("2")) {
                System.out.print("\nNama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                user = cariUser(nama, nim, false);
                if (user == null)
                    System.out.println("\nNama atau NIM salah!\n");
            } else {
                System.out.println("\nPilihan tidak valid!\n");
            }
        }

        user.displayAppMenu();
        scanner.close();
    }

    public static User cariUser(String input1, String input2, boolean isAdmin) {
        for (User u : userList) {
            if (isAdmin && u instanceof Admin) {
                if (((Admin) u).login(input1, input2))
                    return u;
            } else if (!isAdmin && u instanceof Mahasiswa) {
                if (((Mahasiswa) u).login(input1, input2))
                    return u;
            }
        }
        return null;
    }
}