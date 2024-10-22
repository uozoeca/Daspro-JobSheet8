import java.util.Scanner;

public class PersegiBolong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Masukkan Nilai N = ");
            N = sc.nextInt();
            if (N < 3) {
                System.out.println("Nilai Harus Minimal 3!");
            }
        } while (N < 3);
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
