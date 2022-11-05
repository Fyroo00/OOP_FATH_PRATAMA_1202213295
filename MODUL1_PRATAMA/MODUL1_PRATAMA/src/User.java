import java.util.Scanner;
public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display Use
    String nama;
    int hp;
    

    
    public static void Nama(String nama) {
        System.out.println("Selamat datanf di Restoran EAD");
        System.out.println("silahkan register terlebih dahulu");
        System.out.println("==============================");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = keyboard.nextLine();
        keyboard.close();
        
    }
    public static void hp(int nama){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("No. Handphone: ");
        hp = keyboard.nextInt();
        keyboard.close();
        System.out.println("Register success");
        System.out.println("Name: "+nama);
        System.out.println("No. Handphone: "+hp);

    }
    

}
