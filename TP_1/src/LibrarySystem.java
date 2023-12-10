import java.util.Scanner;

/**
 * @author Rochman Ramadhani Chiefto Irawan
 */

public class LibrarySystem {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("========= Selamat datang di Perpustakaan =========");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("Kami memiliki buku-buku pelajaran, novel, dan skripsi.");

        Scanner scanner = new Scanner(System.in);
        String bookType;
        int overdueDays;
        boolean isValidInput;

        do {
            System.out.print("Masukkan jenis buku (pelajaran/novel/skripsi): ");
            bookType = scanner.nextLine().toLowerCase();

            // Memastikan jenis buku yang dimasukkan valid
            isValidInput = isValidBookType(bookType);

            if (!isValidInput) {
                System.out.println("Jenis buku tidak valid. Silakan coba lagi.");
            }

        } while (!isValidInput);

        do {
            System.out.print("Masukkan jumlah hari keterlambatan: ");

            // Menangani input yang bukan bilangan bulat
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan bilangan bulat.");
                System.out.print("Masukkan jumlah hari keterlambatan: ");
                scanner.next(); // Mengonsumsi input yang tidak valid
            }

            overdueDays = scanner.nextInt();

            // Memastikan jumlah hari keterlambatan tidak negatif
            if (overdueDays < 0) {
                System.out.println("Jumlah hari keterlambatan tidak valid. Silakan coba lagi.");
            }

        } while (overdueDays < 0);

        // Menghitung denda berdasarkan jenis buku
        int fine = calculateFine(bookType, overdueDays);

        if (fine > 0) {
            System.out.println("Denda yang harus dibayar: Rp" + fine);
        } else {
            System.out.println("Tidak ada denda. Buku dikembalikan tepat waktu.");
        }
    }

    // Fungsi untuk memeriksa apakah jenis buku valid
    private static boolean isValidBookType(String bookType) {
        return bookType.equals("pelajaran") || bookType.equals("novel") || bookType.equals("skripsi");
    }

    // Fungsi untuk menghitung denda berdasarkan jenis buku dan jumlah hari keterlambatan
    private static int calculateFine(String bookType, int overdueDays) {
        int finePerDay;

        switch (bookType) {
            case "pelajaran":
                finePerDay = 2000;
                break;
            case "novel":
                finePerDay = 5000;
                break;
            case "skripsi":
                finePerDay = 10000;
                break;
            default:
                return 0; // Mengembalikan 0 jika jenis buku tidak valid
        }

        // Menghitung total denda
        return Math.max(0, finePerDay * overdueDays);
    }
}
