import java.util.Scanner;

/**
 * @author Rochman Ramadhani Chiefto Irawan
 */

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("Masukkan umur pelamar: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input bukan angka. Mohon masukkan angka.");
                System.out.print("Masukkan umur pelamar: ");
                scanner.next(); // Membersihkan buffer
            }
            age = scanner.nextInt();

            if (age <= 0) {
                System.out.println("Umur tidak valid. Mohon masukkan umur yang lebih dari 0.");
            } else {
                checkPositionEligibility(age);

                // Tanya apakah ingin mengulang
                System.out.print("Apakah ingin mengulang? (y/n): ");
                String response = scanner.next().toLowerCase();
                if (!response.equals("y")) {
                    break; // Keluar dari loop jika tidak ingin mengulang
                }
            }
        } while (true); // Loop terus sampai user memilih keluar
    }

    private static void checkPositionEligibility(int age) {
        if (age <= 17) {
            System.out.println("Pelamar masih dibawah umur untuk bekerja.");
        } else if (age <= 25) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Staff.");
        } else if (age <= 30) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Officer.");
        } else if (age <= 35) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Supervisor.");
        } else if (age <= 40) {
            System.out.println("Pelamar memenuhi kriteria untuk posisi Manager.");
        } else {
            System.out.println("Umur pelamar melebihi batas maksimal.");
        }
    }
}
