import java.util.Scanner;

public class RataNilai10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, totalNilai, nilaiMhs;
        double rataNilai;
        while (i <= 5) {
            System.out.println("Input Nilai Mahasiswa Ke- " + i);
            totalNilai = 0;
            for (j = 1; j<= 5; j++) {
                System.out.print("Nilai Ke- " + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-Rata Nilai Mahasiswa Ke- " + i + " Adalah " + rataNilai);
            i++;
        }
    }
}
