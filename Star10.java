import java.util.Scanner;

public class Star10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
    }
}
