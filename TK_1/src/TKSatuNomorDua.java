import java.util.Scanner;

/**
 * @author Rochman Ramadhani Chiefto Irawan
 */
public class TKSatuNomorDua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        if (jumlahBilangan < 3) {
            System.out.println("Jumlah bilangan harus minimal 3.");
            return;
        }

        int[] bilangan = new int[jumlahBilangan];

        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = scanner.nextInt();
        }

        int terkecil = bilangan[0];
        int terbesar = bilangan[0];
        int total = bilangan[0];

        for (int i = 1; i < jumlahBilangan; i++) {
            if (bilangan[i] < terkecil) {
                terkecil = bilangan[i];
            }
            if (bilangan[i] > terbesar) {
                terbesar = bilangan[i];
            }
            total += bilangan[i];
        }

        double rataRata = (double) total / jumlahBilangan;

        System.out.println("\nBilangan terkecil = " + terkecil);
        System.out.println("Bilangan terbesar = " + terbesar);
        System.out.println("\nNilai rata-rata = " + rataRata);

        scanner.close();
    }
}
