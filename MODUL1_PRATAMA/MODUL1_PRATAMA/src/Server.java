package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        String nama;
        int no_hp;

        System.out.println("Selamat datanf di Restoran EAD");
        System.out.println("silahkan register terlebih dahulu");
        System.out.println("==============================");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = keyboard.nextLine();

        System.out.print("No. Handphone: ");
        no_hp = keyboard.nextInt();

        System.out.println("Register success");
        System.out.println("Name: "+nama);
        System.out.println("No. Handphone: "+no_hp);

        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User

        // Display Menu
    }
}