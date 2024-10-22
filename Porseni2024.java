import java.util.Scanner;

public class Porseni2024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPoliteknik, atlet = 5;
        System.out.print("Masukkan Jumlah Politeknik Yang Mendaftar: ");
        jmlPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.println("Politeknik Ke-" + i + ":");

            System.out.println("Cabang Olahraga Badminton");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan Nama Atlet " + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("Politeknik Ke-" + i + ", Cabang Badminton, Atlet " + j + ": " + namaAtlet);
            }
            System.out.println();

            System.out.println("Cabang Olahraga Tenis Meja");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan Nama Atlet " + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("Politeknik Ke-" + i + ", Cabang Tenis Meja, Atlet " + j + ": " + namaAtlet);
            }
            System.out.println();

            System.out.println("Cabang Olahraga Basket");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan Nama Atlet " + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("Politeknik Ke-" + i + ", Cabang Basket, Atlet " + j + ": " + namaAtlet);
            }
            System.out.println();

            System.out.println("Cabang Olahraga Bola Voli");
            for (int j = 1; j <= atlet; j++) {
                System.out.print("Masukkan Nama Atlet " + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("Politeknik Ke-" + i + ", Cabang Bola Voli, Atlet " + j + ": " + namaAtlet);
            }
            System.out.println();
        }
    }
}
