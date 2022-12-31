import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation operasi = new Calculation();

        Scanner input = new Scanner (System.in);
        int pilih;


        System.out.println("==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3.Trapezoid");

        System.out.println("Select operation: ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
            System.out.println("Enter the side of the square");
            fnum = input.nextDouble();
            operasi.square();
            System.out.println();
            case 2:
            operasi.circle();
            System.out.println();
            case 3:
            operasi.Trapezoid();
            System.out.println();
        }

    }
}
