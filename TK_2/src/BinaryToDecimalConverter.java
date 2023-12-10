import java.util.Scanner;

/**
 * @author Rochman Ramadhani Chiefto Irawan
 */

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Input angka biner (maksimal 8 digit): ");
            String binaryString = scanner.nextLine();

            convertBinaryToDecimal(binaryString);

            // Tanya apakah ingin mengulang
            System.out.print("Apakah ingin mengulang? (y/n): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("y")) {
                break; // Keluar dari loop jika tidak ingin mengulang
            }

            // Membersihkan buffer
            scanner.nextLine();

        } while (true); // Loop terus sampai user memilih keluar
    }

    private static void convertBinaryToDecimal(String binaryString) {
        if (binaryString.length() > 8) {
            System.out.println("Digit kelebihan. Mohon input maksimal 8 digit.");
            return;
        }

        if (!binaryString.matches("[01]+")) {
            System.out.println("Input tidak valid. Hanya diperbolehkan angka biner (0 atau 1).");
            return;
        }

        try {
            int decimal = Integer.parseInt(binaryString, 2);
            System.out.println("Angka desimal dari biner " + binaryString + " adalah: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Input bukan angka biner yang valid.");
        }
    }
}
